package com.neoteric.HotelManningMahiDev.hotelGobalData.engineering.repository;

import com.neoteric.HotelManningMahiDev.hotelGobalData.engineering.entity.EngineeringEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EngineeringRepository extends JpaRepository<EngineeringEntity,Long> {
}
