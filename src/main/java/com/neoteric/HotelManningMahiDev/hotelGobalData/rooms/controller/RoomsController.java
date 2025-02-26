package com.neoteric.HotelManningMahiDev.hotelGobalData.rooms.controller;


import com.neoteric.HotelManningMahiDev.exceptions.ApiResponse;
import com.neoteric.HotelManningMahiDev.exceptions.ErrorResponse;
import com.neoteric.HotelManningMahiDev.hotelGobalData.rooms.dto.RoomsDto;
import com.neoteric.HotelManningMahiDev.hotelGobalData.rooms.service.RoomsService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/rooms")
public class RoomsController {

   private final RoomsService roomsService;

   public RoomsController(RoomsService roomsService) {
         this.roomsService = roomsService;
   }

    @PostMapping("/create")
   public ResponseEntity<ApiResponse> addingRoom(@RequestBody @Valid RoomsDto roomsDto) {
      roomsService.addingRoom(roomsDto);
       return new ResponseEntity<>(new ApiResponse(HttpStatus.OK.value(), "room is created"),HttpStatus.OK);
   }

}
