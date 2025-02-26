package com.neoteric.HotelManningMahiDev.hotelGobalData.culinary.service;


import com.neoteric.HotelManningMahiDev.aop.TrackExecutionTime;
import com.neoteric.HotelManningMahiDev.exceptions.ApiResponse;
import com.neoteric.HotelManningMahiDev.exceptions.ErrorResponse;
import com.neoteric.HotelManningMahiDev.hotelGobalData.culinary.dto.CulinaryTotalDto;
import com.neoteric.HotelManningMahiDev.hotelGobalData.culinary.entity.CulinaryEntity;
//import com.neoteric.HotelManningMahiDev.hotelGobalData.culinary.entity.CulinaryTotalEntity;
import com.neoteric.HotelManningMahiDev.hotelGobalData.culinary.entity.CuratorDinningEntity;
import com.neoteric.HotelManningMahiDev.hotelGobalData.culinary.entity.CuratorDinningTwoEntity;
import com.neoteric.HotelManningMahiDev.hotelGobalData.culinary.repository.CulinaryRepository;
//import com.neoteric.HotelManningMahiDev.hotelGobalData.culinary.repository.CulinaryTotalRepository;
import com.neoteric.HotelManningMahiDev.hotelGobalData.culinary.repository.CuratorDinningRepository;
import com.neoteric.HotelManningMahiDev.hotelGobalData.culinary.repository.CuratorDinningTwoRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class CulinaryTotalService {
    private final ModelMapper modelMapper;
 //   private final CulinaryTotalRepository culinaryTotalRepository;
    private final CuratorDinningRepository curatorDinningRepository;
    private final CulinaryRepository culinaryRepository;
    private final CuratorDinningTwoRepository curatorDinningTwoRepository;
    @Transactional
    @TrackExecutionTime
    public ResponseEntity<ErrorResponse> adding(@Valid CulinaryTotalDto culinaryTotalDto) {
     culinaryRepository.save(modelMapper.map(culinaryTotalDto.getCulinaryDto(), CulinaryEntity.class));
        curatorDinningRepository.save(modelMapper.map(culinaryTotalDto.getCuratorDinningDto(), CuratorDinningEntity.class));
        curatorDinningTwoRepository.save(modelMapper.map(culinaryTotalDto.getCuratorDinningTwoDto(), CuratorDinningTwoEntity.class));
       // culinaryTotalRepository.save(modelMapper.map(culinaryTotalDto, CulinaryTotalEntity.class));

        return new ResponseEntity<>(HttpStatus.CREATED);
    }


}
