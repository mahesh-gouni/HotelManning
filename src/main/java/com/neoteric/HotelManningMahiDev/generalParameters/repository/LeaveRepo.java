package com.neoteric.HotelManningMahiDev.generalParameters.repository;

import com.neoteric.HotelManningMahiDev.generalParameters.entity.LeaveEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeaveRepo extends JpaRepository<LeaveEntity,Long> {
}
