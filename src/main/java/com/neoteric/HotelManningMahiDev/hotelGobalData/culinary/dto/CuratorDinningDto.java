package com.neoteric.HotelManningMahiDev.hotelGobalData.culinary.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class CuratorDinningDto {
    @NotNull(message = "Please provide the number of projected daily covers in curator dinning")
    private int numberOfProjectedDailyCoversInCuratorDinning;
    @NotNull(message = "Please provide the number of projected seating")
    private int projectedSeating;
}
