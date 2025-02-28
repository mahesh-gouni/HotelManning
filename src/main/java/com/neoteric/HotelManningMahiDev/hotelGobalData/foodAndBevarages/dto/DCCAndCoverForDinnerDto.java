package com.neoteric.HotelManningMahiDev.hotelGobalData.foodAndBevarages.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class DCCAndCoverForDinnerDto {
    private List<DailyCoverConsuptionsDto> coverForDinner= new ArrayList<>();
    private Double total;

}
