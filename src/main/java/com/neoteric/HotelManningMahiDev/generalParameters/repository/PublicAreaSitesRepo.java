package com.neoteric.HotelManningMahiDev.generalParameters.repository;

import com.neoteric.HotelManningMahiDev.generalParameters.entity.PublicAreaSitesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublicAreaSitesRepo extends JpaRepository<PublicAreaSitesEntity,Long> {
}
