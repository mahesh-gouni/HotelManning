package com.neoteric.HotelManningMahiDev.generalParameters.repository;


import com.neoteric.HotelManningMahiDev.generalParameters.entity.GeneralParametersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneralParametersRepo extends JpaRepository<GeneralParametersEntity,Long> {
}
