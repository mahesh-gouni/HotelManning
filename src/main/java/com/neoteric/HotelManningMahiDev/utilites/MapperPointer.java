package com.neoteric.HotelManningMahiDev.utilites;



import com.neoteric.HotelManningMahiDev.generalParameters.dto.GeneralParameters;
import com.neoteric.HotelManningMahiDev.generalParameters.entity.GeneralParametersEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MapperPointer {
    @Autowired
    private ModelMapper modelMapper;
//
//    public User convertToDto(UserEntity userEnity) {
//        return modelMapper.map(userEnity, User.class);
//    }
//
//    public UserEntity convertToEntity(User user) {
//        return modelMapper.map(user, UserEntity.class);
//
//
//    }
//
//    public SignUp convertToDtoSignUp(SignUpEntity signUpEntity) {
//        return modelMapper.map(signUpEntity, SignUp.class);
//    }
//
//    public SignUpEntity convertToEntitySignUP(SignUp signUp) {
//        return modelMapper.map(signUp, SignUpEntity.class);
//
//
//    }

    public GeneralParameters convertToDtoGeneralParameters(GeneralParametersEntity generalParametersEntity) {
        return modelMapper.map(generalParametersEntity, GeneralParameters.class);
    }

    public GeneralParametersEntity convertToEntityGeneralParameters(GeneralParameters generalParameters) {
        return modelMapper.map(generalParameters, GeneralParametersEntity.class);
    }

}
