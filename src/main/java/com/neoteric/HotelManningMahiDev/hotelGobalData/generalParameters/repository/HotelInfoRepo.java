package com.neoteric.HotelManningMahiDev.hotelGobalData.generalParameters.repository;

import com.neoteric.HotelManningMahiDev.hotelGobalData.generalParameters.entity.HotelInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelInfoRepo extends JpaRepository<HotelInfoEntity, Long> {
}
