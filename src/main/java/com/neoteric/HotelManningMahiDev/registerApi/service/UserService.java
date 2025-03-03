//package com.neoteric.HotelManningMahiDev.registerApi.service;
//
//
//
//import com.neoteric.HotelManningMahiDev.exceptions.EmailAlreadyTakenException;
//import com.neoteric.HotelManningMahiDev.exceptions.ErrorResponse;
//import com.neoteric.HotelManningMahiDev.exceptions.NoCredentialsFoundException;
//import com.neoteric.HotelManningMahiDev.registerApi.entity.UserEntity;
//import com.neoteric.HotelManningMahiDev.registerApi.modelOrDto.Login;
//import com.neoteric.HotelManningMahiDev.registerApi.modelOrDto.User;
//import com.neoteric.HotelManningMahiDev.registerApi.repo.UserRepo;
////import com.neoteric.HotelManningMahiDev.utilites.MapperPointer;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Service;
//
//import java.util.logging.Logger;
//
//@Service
//public class UserService {
//
//    private static final Logger logger = Logger.getLogger(UserService.class.getName());
//
//    private UserRepo userRepo;
// //   private MapperPointer mapperPointer;
//
////    public UserService(UserRepo userRepo, MapperPointer mapperPointer) {
////        this.userRepo = userRepo;
////        this.mapperPointer = mapperPointer;
////    }
//
//    public ResponseEntity<ErrorResponse> register(User user) {
//        logger.info("user before converting to entity in service"+user);
//     //   UserEntity userEntity = mapperPointer.convertToEntity(user);
//       // logger.info("user after converting to entity in service"+userEntity);
//        if (userRepo.findById(user.getEmail()).isPresent()) {
//            throw new EmailAlreadyTakenException("Email already taken"+user.getEmail());
//        }
//      //  userRepo.save(userEntity);
//        logger.info("User successfully registered with email: ");
//        if (userRepo.findById(user.getMobile()).isPresent()) {
//            throw new EmailAlreadyTakenException("Mobile number already taken" + user.getMobile());
//        }
//return ResponseEntity.ok().build();
//    }
//
//
//
//    public ResponseEntity<ErrorResponse> login(Login login) {
//        userRepo.findById(login.getEmail())
//                .ifPresentOrElse(userEntity -> {
//                    if (userEntity.getPassword().equals(login.getPassword())) {
//                        logger.info("Login successful for user: " + login.getEmail());
//                    } else {
//                        throw new NoCredentialsFoundException("Password mismatch for user: " + login.getEmail());
//                    }
//                }, () -> {
//                    throw new NoCredentialsFoundException("No user found with username: " + login.getEmail());
//                });
//        return ResponseEntity.ok().build();
//    }
//
//
//}
