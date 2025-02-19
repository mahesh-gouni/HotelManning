package com.neoteric.HotelManningMahiDev.hotelGobalData.generalParameters.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.sql.Date;

@Component
@Data
public class Product {
    private int productId;
    private String productName;
    private String description;
    private String brand;
    private double price;
    private String category;
    private Date releaseDate;
    private int quantity;
    //private BigDecimal image;


}
