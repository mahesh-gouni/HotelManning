package com.neoteric.HotelManningMahiDev.hotelGobalData.commerical.dto;

import lombok.Data;

@Data
public class RoomsOrFandBReservations {
    private int numberOfProjectectedRoomReservations;
    private  int totalNumberOfCallsExpected;
    private int totalNumberOfRestaurantsRequiring;
    private int numberOfShiftsInRestaurantReservations;
    private int numberOfAdvisorsPerTeamLeader;
}
