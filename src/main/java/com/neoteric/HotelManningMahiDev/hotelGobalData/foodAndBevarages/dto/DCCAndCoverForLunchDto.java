package com.neoteric.HotelManningMahiDev.hotelGobalData.foodAndBevarages.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class DCCAndCoverForLunchDto {
  private   List<DailyCoverConsuptionsDto> coverForLunch= new ArrayList<>();
    private Double total;
}
