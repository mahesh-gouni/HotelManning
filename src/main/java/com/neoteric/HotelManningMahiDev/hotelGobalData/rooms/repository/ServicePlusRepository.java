package com.neoteric.HotelManningMahiDev.hotelGobalData.rooms.repository;

import com.neoteric.HotelManningMahiDev.hotelGobalData.rooms.enitity.ServicePlusEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicePlusRepository extends JpaRepository<ServicePlusEntity, Long> {
}
