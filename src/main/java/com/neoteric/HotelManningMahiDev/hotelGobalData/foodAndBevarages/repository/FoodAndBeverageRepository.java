package com.neoteric.HotelManningMahiDev.hotelGobalData.foodAndBevarages.repository;

import com.neoteric.HotelManningMahiDev.hotelGobalData.foodAndBevarages.entity.FoodAndBeverageEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodAndBeverageRepository extends JpaRepository<FoodAndBeverageEntity,Long> {
}
