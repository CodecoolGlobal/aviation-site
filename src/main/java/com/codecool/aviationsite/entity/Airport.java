package com.codecool.aviationsite.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Airport {
    private String id;
    private String name;
    private int numberOfAsphaltRunways;
    private int numberOfGrassRunways;
}
