package com.rsanme.parking.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Projeto: lab-cloud-parking
 * Desenvolvedor: Reginaldo Santos de Medeiros (regissanme)
 * Data: 18/08/2022
 * Hora: 15:29
 */
@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class ParkingCheckoutException extends RuntimeException{

    public ParkingCheckoutException(String message) {
        super(message);
    }
}
