package com.neoteric.HotelManningMahiDev.hotelGobalData.generalParameters.repository;

import com.neoteric.HotelManningMahiDev.hotelGobalData.generalParameters.entity.LeaveEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeaveRepo extends JpaRepository<LeaveEntity,Long> {
}
