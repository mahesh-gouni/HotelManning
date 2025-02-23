package com.neoteric.HotelManningMahiDev.hotelGobalData.rooms.repository;


import com.neoteric.HotelManningMahiDev.hotelGobalData.rooms.enitity.HouseKeepingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HouseKeepingRepository extends JpaRepository<HouseKeepingEntity,Long> {
}
