package com.neoteric.HotelManningMahiDev.hotelGobalData.rooms.repository;

import com.neoteric.HotelManningMahiDev.hotelGobalData.rooms.enitity.SpaOrFitnessAndRecreationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpaOrFitnessAndRecreationRepository extends JpaRepository<SpaOrFitnessAndRecreationEntity,Long> {
}
