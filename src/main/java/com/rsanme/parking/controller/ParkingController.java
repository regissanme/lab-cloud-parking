package com.rsanme.parking.controller;

import com.rsanme.parking.controller.dto.ParkingCreateDTO;
import com.rsanme.parking.controller.dto.ParkingDTO;
import com.rsanme.parking.controller.mapper.ParkingMapper;
import com.rsanme.parking.model.Parking;
import com.rsanme.parking.service.ParkingService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Projeto: lab-cloud-parking
 * Desenvolvedor: Reginaldo Santos de Medeiros (regissanme)
 * Data: 17/08/2022
 * Hora: 12:59
 */
@RestController
@RequestMapping("/parking")
@Api(tags = "Parking Controller")
public class ParkingController {

    private final ParkingService parkingService;
    private final ParkingMapper parkingMapper;

    public ParkingController(ParkingService parkingService, ParkingMapper parkingMapper) {
        this.parkingService = parkingService;
        this.parkingMapper = parkingMapper;
    }

    @GetMapping
    @ApiOperation("Find all parkings")
    public ResponseEntity<List<ParkingDTO>> findAll() {
        List<Parking> parkingList = parkingService.findAll();
        return ResponseEntity.ok(parkingMapper.toDtoList(parkingList));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ParkingDTO> findById(@PathVariable String id) {
        Parking response = parkingService.findById(id);
        return ResponseEntity.ok(parkingMapper.toDto(response));
    }

    @PostMapping
    public ResponseEntity<ParkingDTO> create(@RequestBody ParkingCreateDTO parkingCreateDTO) {
        var parkingCreate = parkingMapper.toModel(parkingCreateDTO);
        var parkingSave = parkingService.create(parkingCreate);
        var result = parkingMapper.toDto(parkingSave);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(result);
    }
}
