package com.neoteric.HotelManningMahiDev.hotelGobalData.commerical.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class RoomsOrFandBReservations {
    @NotNull(message = "Please provide the number of projected room reservations")
    private int numberOfProjectectedRoomReservations;
    @NotNull(message = "Please provide the number of projected F&B reservations")
    private  int totalNumberOfCallsExpected;
    @NotNull(message = "Please provide the number of total number of restaurants requiring reservations")
    private int totalNumberOfRestaurantsRequiring;
    @NotNull(message = "Please provide the number of shifts in restaurant reservations")
    private int numberOfShiftsInRestaurantReservations;
    @NotNull(message = "Please provide the number of Advisors per Team Leader")
    private int numberOfAdvisorsPerTeamLeader;
}
