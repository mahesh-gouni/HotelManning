package com.neoteric.HotelManningMahiDev.hotelGobalData.rooms.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class LaundryDto {
    @NotNull(message = "average daily laundry usage is required")
    private double averageDailyLaundryUsage;
    @NotNull(message = "average daily laundry is required")
    private double averageDailyLaundry;
}
