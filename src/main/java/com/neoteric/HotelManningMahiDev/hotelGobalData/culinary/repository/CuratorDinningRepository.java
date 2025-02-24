package com.neoteric.HotelManningMahiDev.hotelGobalData.culinary.repository;

import com.neoteric.HotelManningMahiDev.hotelGobalData.culinary.entity.CuratorDinningEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CuratorDinningRepository extends JpaRepository<CuratorDinningEntity,Long> {
}
