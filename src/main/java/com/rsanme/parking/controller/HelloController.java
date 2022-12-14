package com.rsanme.parking.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

/**
 * Projeto: cloud-parking
 * Desenvolvedor: Reginaldo Santos de Medeiros (regissanme)
 * Data: 17/08/2022
 * Hora: 10:12
 */
@RestController
@RequestMapping("/")
@ApiIgnore
public class HelloController {

    @GetMapping
    public String hello() {
        return "Hello! I'm running...";
    }
}
