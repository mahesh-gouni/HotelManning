package com.neoteric.HotelManningMahiDev.hotelGobalData.generalParameters.repository;

import com.neoteric.HotelManningMahiDev.hotelGobalData.generalParameters.entity.PublicAreaSitesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublicAreaSitesRepo extends JpaRepository<PublicAreaSitesEntity,Long> {
}
