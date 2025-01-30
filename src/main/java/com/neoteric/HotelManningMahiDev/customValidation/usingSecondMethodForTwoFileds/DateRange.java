package com.neoteric.HotelManningMahiDev.customValidation.usingSecondMethodForTwoFileds;

import lombok.Data;

import java.time.LocalDate;
@Data
class DateRange {

    private LocalDate startOfRange;
    private LocalDate endOfRange;

    // getters, setters, etc.
}
