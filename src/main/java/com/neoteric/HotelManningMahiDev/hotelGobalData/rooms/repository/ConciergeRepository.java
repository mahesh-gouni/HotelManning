package com.neoteric.HotelManningMahiDev.hotelGobalData.rooms.repository;

import com.neoteric.HotelManningMahiDev.hotelGobalData.rooms.enitity.ConciergeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConciergeRepository extends JpaRepository<ConciergeEntity,Long > {
}
