package com.rsanme.parking.controller.mapper;

import com.rsanme.parking.controller.dto.ParkingCreateDTO;
import com.rsanme.parking.controller.dto.ParkingDTO;
import com.rsanme.parking.model.Parking;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Projeto: lab-cloud-parking
 * Desenvolvedor: Reginaldo Santos de Medeiros (regissanme)
 * Data: 17/08/2022
 * Hora: 13:37
 */
@Component
public class ParkingMapper {

    private static final ModelMapper MODEL_MAPPER = new ModelMapper();

    public Parking toModel(ParkingDTO parkingDTO){
        return MODEL_MAPPER.map(parkingDTO, Parking.class);
    }

    public Parking toModel(ParkingCreateDTO parkingCreateDTO){
        return MODEL_MAPPER.map(parkingCreateDTO, Parking.class);
    }

    public ParkingDTO toDto(Parking parking){
        return MODEL_MAPPER.map(parking, ParkingDTO.class);
    }

    public List<Parking> toModelList(List<ParkingDTO> parkingDTOList){
        return parkingDTOList.stream().map(this::toModel).collect(Collectors.toList());
    }

    public List<ParkingDTO> toDtoList(List<Parking> parkingList){
        return parkingList.stream().map(this::toDto).collect(Collectors.toList());
    }
}
