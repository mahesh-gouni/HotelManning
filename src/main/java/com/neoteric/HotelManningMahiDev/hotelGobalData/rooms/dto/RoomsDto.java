package com.neoteric.HotelManningMahiDev.hotelGobalData.rooms.dto;

import jakarta.validation.Valid;
import lombok.Data;

@Data
public class RoomsDto {
    @Valid
    private FrontOfficeDto frontOffice;
    @Valid
    private HouseKeepingDto houseKeeping;
    @Valid
    private ConciergeDto concierge;
    @Valid
    private ServicePlusDto servicePlus;
    @Valid
    private LaundryDto laundry;
    @Valid
    private SpaOrFitnessAndRecreationDto spaOrFitnessAndRecreation;
}
