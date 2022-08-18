package com.rsanme.parking.service;

import com.rsanme.parking.exception.ParkingNotFoundException;
import com.rsanme.parking.model.Parking;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Projeto: lab-cloud-parking
 * Desenvolvedor: Reginaldo Santos de Medeiros (regissanme)
 * Data: 17/08/2022
 * Hora: 13:12
 */
@Service
public class ParkingService {

    private static final Map<String, Parking> parkingMap = new HashMap<>();

    static {
        var id = getUUID();
        var id1 = getUUID();

        Parking parking = new Parking(id, "GOO-4110","GO","CELTA", "PRETO");
        Parking parking1 = new Parking(id1, "GOO-4114","SP","CLASSIC", "PRATA");

        parkingMap.put(id, parking);
        parkingMap.put(id1, parking1);
    }

    public List<Parking> findAll() {
        return new ArrayList<>(parkingMap.values());
    }

    private static String getUUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }

    public Parking findById(String id) {
        Parking parking = parkingMap.get(id);
        if(parking == null){
            throw new ParkingNotFoundException(id);
        }
        return parking;
    }

    public Parking create(Parking parking) {
        String id = getUUID();
        parking.setId(id);
        parking.setEntryDate(LocalDateTime.now());
        parkingMap.put(id, parking);

        return parking;
    }

    public Parking update(String id, Parking parking){
        Parking parkingSalvo = findById(id);
        parking.setEntryDate(parkingSalvo.getEntryDate());
        parking.setExitDate(parkingSalvo.getExitDate());

        parkingMap.replace(id, parking);
        return parking;
    }

    public void delete(String id) {
        Parking parking = findById(id);
        parkingMap.remove(id);
    }

    public Parking finalizeParking(String id) {
        Parking toFinalize = findById(id);
        toFinalize.setExitDate(LocalDateTime.now());

        return update(id, toFinalize);
    }
}
