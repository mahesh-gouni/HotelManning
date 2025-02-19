package com.neoteric.HotelManningMahiDev.hotelGobalData.security.repository;

import com.neoteric.HotelManningMahiDev.hotelGobalData.security.enity.SecurityEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecurityRepository extends JpaRepository<SecurityEntity,Long> {
}
