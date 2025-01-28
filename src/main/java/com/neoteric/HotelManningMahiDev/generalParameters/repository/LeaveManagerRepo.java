package com.neoteric.HotelManningMahiDev.generalParameters.repository;

import com.neoteric.HotelManningMahiDev.generalParameters.entity.LeavesManagerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeaveManagerRepo extends JpaRepository<LeavesManagerEntity,Long> {
}
