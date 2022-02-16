package com.codecool.aviationsite.entity;

import com.codecool.aviationsite.dto.AirportDTO;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Airport {
    private String id;
    private String name;
    private int numberOfAsphaltRunways;
    private int numberOfGrassRunways;

    public Airport(String id, AirportDTO airportDTO){
        this.id = id;
        this.name = airportDTO.getName();
        this.numberOfAsphaltRunways = airportDTO.getNumberOfAsphaltRunways();
        this.numberOfGrassRunways = airportDTO.getNumberOfGrassRunways();
    }
}
