package com.neoteric.HotelManningMahiDev.hotelGobalData.commerical.repository;

import com.neoteric.HotelManningMahiDev.hotelGobalData.commerical.enitity.RoomsOrFandBReservationsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomsOrFandBReservationsRepository extends JpaRepository<RoomsOrFandBReservationsEntity, Long> {
}
