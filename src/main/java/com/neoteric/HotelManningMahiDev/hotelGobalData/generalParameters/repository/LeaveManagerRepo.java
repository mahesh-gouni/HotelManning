package com.neoteric.HotelManningMahiDev.hotelGobalData.generalParameters.repository;

import com.neoteric.HotelManningMahiDev.hotelGobalData.generalParameters.entity.LeavesManagerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeaveManagerRepo extends JpaRepository<LeavesManagerEntity,Long> {
}
