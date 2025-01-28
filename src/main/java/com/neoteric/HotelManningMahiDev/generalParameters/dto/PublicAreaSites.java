package com.neoteric.HotelManningMahiDev.generalParameters.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PublicAreaSites {
    private Long id;
    private String nameOfTheArea;
    private double sqMt;


}
