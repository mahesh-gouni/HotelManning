package com.neoteric.HotelManningMahiDev.customValidation.usingTwofields;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
@DateRange(before = "startDate", after = "endDate", message = "Start date should be less than end date")
public class OfferDto {
    private Long id;
//    @NotNull(message = "offer title required")
//    @Size(max = 20, min = 8, message = "Offer title must be between 8 and 20 characters")
    private String offerTitle;
//    @Size(max = 100, min = 8, message = "Offer title must be between 8 and 100 characters")
//    @NotNull(message = "offer description required")
    private String description;
    //@JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate startDate;
   // @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate endDate;


}
