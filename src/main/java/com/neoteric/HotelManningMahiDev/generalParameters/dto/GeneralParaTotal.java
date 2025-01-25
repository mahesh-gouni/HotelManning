package com.neoteric.HotelManningMahiDev.generalParameters.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GeneralParaTotal {

    private HotelInfo hotelInfo;
    private GeneralParameters generalParameters;
    private PublicAreaSiteManger publicAreaSiteManger;
    private RoomTypeManager roomTypeManager;
    private LeavesManger leavesManger;



}
