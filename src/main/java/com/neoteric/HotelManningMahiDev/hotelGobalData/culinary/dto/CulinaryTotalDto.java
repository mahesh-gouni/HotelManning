package com.neoteric.HotelManningMahiDev.hotelGobalData.culinary.dto;

import jakarta.validation.Valid;
import lombok.Data;

@Data
public class CulinaryTotalDto {
    @Valid
    private CulinaryDto culinaryDto;
    @Valid
    private CuratorDinningDto curatorDinningDto;
    @Valid
    private CuratorDinningTwoDto curatorDinningTwoDto;

}
