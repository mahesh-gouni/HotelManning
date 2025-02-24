package com.neoteric.HotelManningMahiDev.hotelGobalData.culinary.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class CulinaryDto {
    @NotNull(message = "Please provide the number of outlets")
    private int numberOfOutlets;
    @NotBlank(message = "Please provide the levels")
    private String levels;
    @NotBlank(message = "Please provide the main kitchen sections")
    private String mainKitchenSections;
    @NotEmpty(message = "Please provide the kitchen section names at least one")
    private List<String> kitchenSectionNames =new ArrayList<>();
    @NotNull(message = "Please provide the number of projected daily covers served by main kitchen")
    private int numberOfProjectedDailyCoversServedByMainKitchen;
    @NotNull(message = "Please provide the number of shifts")
    private int numberOfShifts;
}
