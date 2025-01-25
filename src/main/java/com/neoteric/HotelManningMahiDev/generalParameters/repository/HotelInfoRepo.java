package com.neoteric.HotelManningMahiDev.generalParameters.repository;

import com.neoteric.HotelManningMahiDev.generalParameters.entity.HotelInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelInfoRepo extends JpaRepository<HotelInfoEntity, Long> {
}
