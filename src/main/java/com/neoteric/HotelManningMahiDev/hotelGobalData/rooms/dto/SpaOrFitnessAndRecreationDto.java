package com.neoteric.HotelManningMahiDev.hotelGobalData.rooms.dto;

import lombok.Data;

@Data
public class SpaOrFitnessAndRecreationDto {
    private int numberOfTreatmentRooms;
    private int numberOfTreatmentPerRoomsPerDay;
    private int numberOfProjectedDailyTreatments;
    private int numberOfGyms;
    private int numberShitsPerGym;
    private String estimatedPercentageOfInHouseGuestsAtThePool;
    private String estimatedVolumeOfInHouseGuestsAtThePool;
}
