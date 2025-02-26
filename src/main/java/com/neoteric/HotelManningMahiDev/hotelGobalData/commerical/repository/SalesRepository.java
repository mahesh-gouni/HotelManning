package com.neoteric.HotelManningMahiDev.hotelGobalData.commerical.repository;

import com.neoteric.HotelManningMahiDev.hotelGobalData.commerical.enitity.SalesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalesRepository extends JpaRepository<SalesEntity,Long> {
}
