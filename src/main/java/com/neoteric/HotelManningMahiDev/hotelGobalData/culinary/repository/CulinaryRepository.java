package com.neoteric.HotelManningMahiDev.hotelGobalData.culinary.repository;

import com.neoteric.HotelManningMahiDev.hotelGobalData.culinary.entity.CulinaryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CulinaryRepository extends JpaRepository<CulinaryEntity, Long> {
}
