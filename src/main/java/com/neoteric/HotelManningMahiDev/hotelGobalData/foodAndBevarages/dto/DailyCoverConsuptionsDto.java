package com.neoteric.HotelManningMahiDev.hotelGobalData.foodAndBevarages.dto;

import lombok.Data;

@Data
public class DailyCoverConsuptionsDto {
    private String restaurantType;
    private String inHouseCapture;
    private String inHouseCovers;
    private String externalCapture;
    private String externalCover;
    private Double total;
}
