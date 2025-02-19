package com.neoteric.HotelManningMahiDev.hotelGobalData.generalParameters.repository;

import com.neoteric.HotelManningMahiDev.hotelGobalData.generalParameters.entity.RoomTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomTypeRepo extends JpaRepository<RoomTypeEntity,Long> {
}
