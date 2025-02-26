package com.neoteric.HotelManningMahiDev.hotelGobalData.commerical.service;

import com.neoteric.HotelManningMahiDev.exceptions.ApiResponse;
import com.neoteric.HotelManningMahiDev.exceptions.ErrorResponse;
import com.neoteric.HotelManningMahiDev.hotelGobalData.commerical.dto.CommercialDto;
import com.neoteric.HotelManningMahiDev.hotelGobalData.commerical.enitity.RoomsOrFandBReservationsEntity;
import com.neoteric.HotelManningMahiDev.hotelGobalData.commerical.enitity.SalesEntity;
//import com.neoteric.HotelManningMahiDev.hotelGobalData.commerical.repository.CommercialRepository;
import com.neoteric.HotelManningMahiDev.hotelGobalData.commerical.repository.RoomsOrFandBReservationsRepository;
import com.neoteric.HotelManningMahiDev.hotelGobalData.commerical.repository.SalesRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.logging.Logger;

@Service
@RequiredArgsConstructor
public class CommercialService {
    private static final Logger logger = Logger.getLogger(CommercialService.class.getName());
   // private final CommercialRepository commercialRepository;
    private final ModelMapper modelMapper;
    private final RoomsOrFandBReservationsRepository roomsOrFandBReservationsRepository;
    private final SalesRepository salesRepository;

    @Transactional
    public ResponseEntity addinCommercial(@Valid CommercialDto commercialDto) {
      roomsOrFandBReservationsRepository.save(modelMapper.map(commercialDto.getRoomsOrFandBReservations(), RoomsOrFandBReservationsEntity.class));
        salesRepository.save(modelMapper.map(commercialDto.getSales(), SalesEntity.class));

        return new ResponseEntity<>(HttpStatus.OK);
    }
}
