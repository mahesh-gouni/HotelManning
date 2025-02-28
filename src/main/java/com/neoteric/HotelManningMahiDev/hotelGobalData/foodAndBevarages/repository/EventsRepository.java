package com.neoteric.HotelManningMahiDev.hotelGobalData.foodAndBevarages.repository;

import com.neoteric.HotelManningMahiDev.hotelGobalData.foodAndBevarages.entity.EventsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventsRepository extends JpaRepository<EventsEntity,Long> {
}
