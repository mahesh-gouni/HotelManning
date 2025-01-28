package com.neoteric.HotelManningMahiDev.generalParameters.repository;

import com.neoteric.HotelManningMahiDev.generalParameters.entity.GeneralParaTotalEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneralParaTotalRepository extends JpaRepository<GeneralParaTotalEntity,Long> {
}
