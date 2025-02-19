package com.neoteric.HotelManningMahiDev.hotelGobalData.hr.repository;

import com.neoteric.HotelManningMahiDev.hotelGobalData.hr.enities.CuratorAccommodationAndDinningEnity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CuratorAccommodationAndDinningRepository extends JpaRepository<CuratorAccommodationAndDinningEnity,Long> {
}
