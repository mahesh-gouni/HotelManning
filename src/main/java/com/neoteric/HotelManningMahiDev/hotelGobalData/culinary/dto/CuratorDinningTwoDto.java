package com.neoteric.HotelManningMahiDev.hotelGobalData.culinary.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class CuratorDinningTwoDto {
    @NotNull(message = "Please provide the number of projected daily covers in curator dinning")
    private int numberOfKitchensConsideredForStewarding;
    @NotBlank(message = "Please provide the select kitchen for stewarding")
    private String selectKitchenForStewarding;
}
