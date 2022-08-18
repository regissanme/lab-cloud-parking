package com.rsanme.parking.service;

import com.rsanme.parking.exception.ParkingCheckoutException;
import com.rsanme.parking.exception.ParkingNotFoundException;
import com.rsanme.parking.model.Parking;
import com.rsanme.parking.repository.ParkingRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

/**
 * Projeto: lab-cloud-parking
 * Desenvolvedor: Reginaldo Santos de Medeiros (regissanme)
 * Data: 17/08/2022
 * Hora: 13:12
 */
@Service
public class ParkingService {

    private final ParkingRepository parkingRepository;


    public ParkingService(ParkingRepository parkingRepository) {
        this.parkingRepository = parkingRepository;
    }

    @Transactional(readOnly = true)
    public List<Parking> findAll() {
        return parkingRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Parking findById(String id) {
        return parkingRepository.findById(id)
                .orElseThrow(() -> new ParkingNotFoundException(id));
    }

    @Transactional
    public Parking create(Parking parking) {
        String id = getUUID();
        parking.setId(id);
        parking.setEntryDate(LocalDateTime.now());

        return parkingRepository.save(parking);
    }

    @Transactional
    public Parking update(String id, Parking parkingUpdate) {
        Parking parking = findById(id);
        parking.setColor(parkingUpdate.getColor());
        parking.setState(parkingUpdate.getState());
        parking.setModel(parkingUpdate.getModel());
        parking.setLicence(parkingUpdate.getLicence());

        return parkingRepository.save(parking);
    }

    @Transactional
    public void delete(String id) {
        findById(id);
        parkingRepository.deleteById(id);
    }

    @Transactional
    public Parking checkOut(String id) {
        Parking toCheckOut = findById(id);
        if (toCheckOut.getExitDate() != null) {
            throw new ParkingCheckoutException("Parking already checkout with Id: " + id);
        }
        toCheckOut.setExitDate(LocalDateTime.now());
        toCheckOut.setBill(ParkingCheckout.getBill(toCheckOut));

        return parkingRepository.save(toCheckOut);
    }

    private static String getUUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }
}
