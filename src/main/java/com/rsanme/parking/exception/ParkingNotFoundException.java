package com.rsanme.parking.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Projeto: lab-cloud-parking
 * Desenvolvedor: Reginaldo Santos de Medeiros (regissanme)
 * Data: 17/08/2022
 * Hora: 15:39
 */
@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class ParkingNotFoundException extends RuntimeException {

    public ParkingNotFoundException(String id) {
        super("Parking not found with Id: " + id);
    }
}
