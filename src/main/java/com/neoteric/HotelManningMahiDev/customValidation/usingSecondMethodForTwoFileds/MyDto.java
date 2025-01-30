package com.neoteric.HotelManningMahiDev.customValidation.usingSecondMethodForTwoFileds;

import com.neoteric.HotelManningMahiDev.customValidation.usingTwofields.DateRange;
import lombok.Data;

@Data
public class MyDto {

    @ValidDateRange // <-- target annotation
    private DateRange dateRange;

    // getters, setters, etc.
}
