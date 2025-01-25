package com.neoteric.HotelManningMahiDev.generalParameters.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoomType {
    private String nameOfTheArea;
    private int keys;
    private int bays;
    private int totalBays;
    private double sqMt;
}
