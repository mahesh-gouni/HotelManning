package com.neoteric.HotelManningMahiDev.hotelGobalData.rooms.dto;

import lombok.Data;

@Data
public class RoomsDto {
    private FrontOfficeDto frontOffice;
    private HouseKeepingDto houseKeeping;
    private ConciergeDto concierge;
    private ServicePlusDto servicePlus;
    private LaundryDto laundry;
    private SpaOrFitnessAndRecreationDto spaOrFitnessAndRecreation;
}
