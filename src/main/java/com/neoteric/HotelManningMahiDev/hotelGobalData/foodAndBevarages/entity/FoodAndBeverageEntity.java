package com.neoteric.HotelManningMahiDev.hotelGobalData.foodAndBevarages.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "foodAndBeverage")
public class FoodAndBeverageEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long foodAndBeverageId;
    @Column(name = "totalNumberOfRestaurants")
    private int totalNumberOfRestaurants;
    @Column(name = "restaurantTypes")
    private String restaurantTypes;
    @Column(name = "restaurantNeedingChashier")
    private int restaurantNeedingChashier;
    @Column(name = "totalNumberOfCoversInRestaurants")
    private int totalNumberOfCoversInRestaurants;
    @Column(name = "numberOfProjectedDailyCoversInRestaurants")
    private int numberOfProjectedDailyCoversInRestaurants;
}
