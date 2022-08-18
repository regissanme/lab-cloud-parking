package com.rsanme.parking.repository;

import com.rsanme.parking.model.Parking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Projeto: lab-cloud-parking
 * Desenvolvedor: Reginaldo Santos de Medeiros (regissanme)
 * Data: 18/08/2022
 * Hora: 00:15
 */
@Repository
public interface ParkingRepository extends JpaRepository<Parking, String> {
}
