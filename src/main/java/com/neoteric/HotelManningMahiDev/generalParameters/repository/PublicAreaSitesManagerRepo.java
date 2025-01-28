package com.neoteric.HotelManningMahiDev.generalParameters.repository;

import com.neoteric.HotelManningMahiDev.generalParameters.entity.PublicAreaSiteManagerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublicAreaSitesManagerRepo extends JpaRepository<PublicAreaSiteManagerEntity,Long> {
}
