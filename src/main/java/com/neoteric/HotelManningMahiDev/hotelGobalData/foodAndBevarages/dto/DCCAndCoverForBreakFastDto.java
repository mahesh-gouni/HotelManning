package com.neoteric.HotelManningMahiDev.hotelGobalData.foodAndBevarages.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class DCCAndCoverForBreakFastDto {
    private List<DailyCoverConsuptionsDto>  breakFast= new ArrayList<>();
    private Double total;
}
