//package com.neoteric.HotelManningMahiDev.registerApi.controller;
//
//
//
//import com.neoteric.HotelManningMahiDev.exceptions.ErrorResponse;
//import com.neoteric.HotelManningMahiDev.registerApi.modelOrDto.Login;
//import com.neoteric.HotelManningMahiDev.registerApi.modelOrDto.User;
//import com.neoteric.HotelManningMahiDev.registerApi.service.UserService;
//import jakarta.validation.Valid;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.logging.Logger;
//
//
//
//@RestController
//@RequestMapping("/api/auth")
//public class UserController {
//    private static final Logger logger = Logger.getLogger(UserController.class.getName());
//
//
//    private UserService userService;
//
//    public UserController( UserService userService){
//        this.userService=userService;
//    }
//
//    @PostMapping("/signup")
//    public ResponseEntity<ErrorResponse> register(@RequestBody @Valid User user){
//        logger.info(" sign up user received"+user);
//        userService.register(user);
//        return new  ResponseEntity<>(HttpStatus.ACCEPTED);
//    }
//
//    @PostMapping("/login")
//    public ResponseEntity<ErrorResponse> authenticateUser(@RequestBody @Valid Login login){
//        logger.info("login in the controller"+login);
//        userService.login(login);
//        return new ResponseEntity<>( HttpStatus.OK);
//    }
//
//}
