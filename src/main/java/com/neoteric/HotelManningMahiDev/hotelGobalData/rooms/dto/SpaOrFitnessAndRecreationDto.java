package com.neoteric.HotelManningMahiDev.hotelGobalData.rooms.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class SpaOrFitnessAndRecreationDto {
    @NotNull(message = "Number of treatment rooms is required")
    private int numberOfTreatmentRooms;
    @NotNull(message = "Number of treatment rooms per day is required")
    private int numberOfTreatmentPerRoomsPerDay;
    @NotNull(message = "Number of projected daily treatments is required")
    private int numberOfProjectedDailyTreatments;
    @NotNull(message = "Number of gyms is required")
    private int numberOfGyms;
    @NotNull(message = "Number of shits per gym is required")
    private int numberShitsPerGym;
    @NotBlank(message = "estimated percentage of in house guests at the pool is required")
    private String estimatedPercentageOfInHouseGuestsAtThePool;
    @NotBlank(message = "estimated volume of in house guests at the pool is required")
    private String estimatedVolumeOfInHouseGuestsAtThePool;
}
