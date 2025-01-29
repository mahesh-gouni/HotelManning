package com.neoteric.HotelManningMahiDev.exceptions;

import com.neoteric.HotelManningMahiDev.generalParameters.dto.GeneralParameters;
import com.neoteric.HotelManningMahiDev.generalParameters.dto.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MicroResponse {
    private GeneralParameters generalParameters;
    private Product product;

}
