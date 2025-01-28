package com.neoteric.HotelManningMahiDev.utilites;



import com.neoteric.HotelManningMahiDev.generalParameters.dto.*;
import com.neoteric.HotelManningMahiDev.generalParameters.entity.*;
import com.neoteric.HotelManningMahiDev.registerApi.entity.UserEntity;
import com.neoteric.HotelManningMahiDev.registerApi.modelOrDto.User;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MapperPointer {
    @Autowired
    private ModelMapper modelMapper;
    public User convertToDto(UserEntity userEnity) {
        return modelMapper.map(userEnity, User.class);
    }
    public UserEntity convertToEntity(User user) {
        return modelMapper.map(user, UserEntity.class);
    }

    public GeneralParameters convertToDtoGeneralParameters(GeneralParametersEntity generalParametersEntity) {
        return modelMapper.map(generalParametersEntity, GeneralParameters.class);
    }

    public GeneralParametersEntity convertToEntityGeneralParameters(GeneralParameters generalParameters) {
        return modelMapper.map(generalParameters, GeneralParametersEntity.class);
    }

    public GeneralParaTotal convertToDtoGeneralParaTotal(GeneralParaTotalEntity generalParaTotalEntity) {
        return modelMapper.map(generalParaTotalEntity, GeneralParaTotal.class);

    }
    public GeneralParaTotalEntity convertToEntityGeneralParaTotal(GeneralParaTotal generalParaTotal) {
        return modelMapper.map(generalParaTotal, GeneralParaTotalEntity.class);
    }
    public HotelInfo convertToDtoHotelInfo(HotelInfoEntity hotelInfoEntity) {
        return modelMapper.map(hotelInfoEntity, HotelInfo.class);

    }
    public HotelInfoEntity convertToEntityHotelInfo(HotelInfo hotelInfo) {
        return modelMapper.map(hotelInfo, HotelInfoEntity.class);
    }

    public Leave convertToDtoLeave(LeaveEntity leaveEntity) {

        return modelMapper.map(leaveEntity, Leave.class);
    }
    public LeaveEntity convertToEntityLeave(Leave leave) {
        return modelMapper.map(leave, LeaveEntity.class);
    }

public LeavesManager convertToDtoLeavesManger(LeavesManagerEntity leavesMangerEntity) {
        return modelMapper.map(leavesMangerEntity, LeavesManager.class);
    }
    public LeavesManagerEntity convertToEntityLeavesManger(LeavesManager leavesManger) {
        return modelMapper.map(leavesManger, LeavesManagerEntity.class);
    }

    public RoomType convertToDtoRoomType(RoomTypeEntity roomTypeEntity) {
        return modelMapper.map(roomTypeEntity, RoomType.class);

    }
    public RoomTypeEntity convertToEntityRoomType(RoomType roomType) {
        return modelMapper.map(roomType, RoomTypeEntity.class);
    }
    public PublicAreaSiteManager convertToDtoPublicAreaSiteManager(PublicAreaSiteManagerEntity publicAreaSiteManagerEntity) {
        return modelMapper.map(publicAreaSiteManagerEntity, PublicAreaSiteManager.class);
    }
    public PublicAreaSiteManagerEntity convertToEntityPublicAreaSiteManager(PublicAreaSiteManager publicAreaSiteManager) {
        return modelMapper.map(publicAreaSiteManager, PublicAreaSiteManagerEntity.class);
    }
    public PublicAreaSites convertToDtoPublicAreaSites(PublicAreaSitesEntity publicAreaSitesEntity) {
        return modelMapper.map(publicAreaSitesEntity, PublicAreaSites.class);
    }
    public PublicAreaSitesEntity convertToEntityPublicAreaSites(PublicAreaSites publicAreaSites) {
        return modelMapper.map(publicAreaSites, PublicAreaSitesEntity.class);
    }
    public RoomTypeManager convertToDtoRoomTypeManager(RoomTypeManagerEntity roomTypeManagerEntity) {
        return modelMapper.map(roomTypeManagerEntity, RoomTypeManager.class);
    }
    public RoomTypeManagerEntity convertToEntityRoomTypeManager(RoomTypeManager roomTypeManager) {
        return modelMapper.map(roomTypeManager, RoomTypeManagerEntity.class);
    }
}
