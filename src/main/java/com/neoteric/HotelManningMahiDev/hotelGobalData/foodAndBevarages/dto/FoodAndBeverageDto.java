package com.neoteric.HotelManningMahiDev.hotelGobalData.foodAndBevarages.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class FoodAndBeverageDto {
    @NotNull(message = "Please provide the total number of restaurants")
    private int totalNumberOfRestaurants;
    @NotBlank(message = "Please provide the restaurant types")
    private String restaurantTypes;
    @NotNull(message = "Please provide the number of restaurants needing chashier")
    private int restaurantNeedingChashier;
    @NotNull(message = "Please provide the number of restaurants needing hostess")
    private int totalNumberOfCoversInRestaurants;
    @NotNull(message = "Please provide the number of projected daily covers in restaurants")
    private int numberOfProjectedDailyCoversInRestaurants;
}
