package com.neoteric.HotelManningMahiDev.hotelGobalData.rooms.repository;

import com.neoteric.HotelManningMahiDev.hotelGobalData.rooms.enitity.FrontOfficeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FrontOfficeRepository extends JpaRepository<FrontOfficeEntity,Long> {

}
