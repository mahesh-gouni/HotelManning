package com.neoteric.HotelManningMahiDev.hotelGobalData.generalParameters.dto;


import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GeneralParaTotal {
    private Long id;
    @Valid
    private HotelInfo hotelInfo;
    @Valid
    private GeneralParameters generalParameters;
    @Valid
    private PublicAreaSiteManager publicAreaSiteManager;
    @Valid
    private RoomTypeManager roomTypeManager;
    @Valid
    private LeavesManager leavesManager;



}
