package com.neoteric.HotelManningMahiDev.hotelGobalData.commerical.repository;

import com.neoteric.HotelManningMahiDev.hotelGobalData.commerical.enitity.CommercialEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommercialRepository extends JpaRepository<CommercialEntity,Long> {

}
