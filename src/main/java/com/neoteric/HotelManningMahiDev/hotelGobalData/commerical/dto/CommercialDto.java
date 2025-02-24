package com.neoteric.HotelManningMahiDev.hotelGobalData.commerical.dto;

import jakarta.validation.Valid;
import lombok.Data;

@Data
public class CommercialDto {
    @Valid
    private Sales sales;
    @Valid
    private RoomsOrFandBReservations roomsOrFandBReservations;
}
