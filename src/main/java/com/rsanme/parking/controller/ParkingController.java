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
    @ApiOperation("Find all cars from parking")
    public ResponseEntity<List<ParkingDTO>> findAll() {
        List<Parking> parkingList = parkingService.findAll();
        return ResponseEntity.ok(parkingMapper.toDtoList(parkingList));
    }

    @GetMapping("/{id}")
    @ApiOperation("Find a car by Id from parking")
    public ResponseEntity<ParkingDTO> findById(@PathVariable String id) {
        Parking response = parkingService.findById(id);
        return ResponseEntity.ok(parkingMapper.toDto(response));
    }

    @PostMapping
    @ApiOperation("Create new car in parking")
    public ResponseEntity<ParkingDTO> create(@RequestBody ParkingCreateDTO parkingCreateDTO) {
        var parkingCreate = parkingMapper.toModel(parkingCreateDTO);
        var parkingSave = parkingService.create(parkingCreate);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(parkingMapper.toDto(parkingSave));
    }

    @PutMapping("/{id}")
    @ApiOperation("Update a car from parking")
    public ResponseEntity<ParkingDTO> update(
            @PathVariable String id,
            @RequestBody ParkingCreateDTO parkingCreateDTO) {

        var parkingCreate = parkingMapper.toModel(parkingCreateDTO);
        var parkingSave = parkingService.update(id, parkingCreate);

        return ResponseEntity.ok(parkingMapper.toDto(parkingSave));
    }

    @DeleteMapping("/{id}")
    @ApiOperation("Delete a car from parking")
    public ResponseEntity<?> delete(@PathVariable String id) {
        parkingService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/checkout/{id}")
    @ApiOperation("Checkout a car from parking")
    public ResponseEntity<ParkingDTO> checkOut(@PathVariable String id) {
        var parking = parkingService.checkOut(id);
        return ResponseEntity.ok(parkingMapper.toDto(parking));
    }
}
