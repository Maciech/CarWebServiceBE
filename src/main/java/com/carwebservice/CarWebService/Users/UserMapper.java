package com.carwebservice.CarWebService.Users;

import com.carwebservice.CarWebService.CarInfo.CarInfoDto;
import com.carwebservice.CarWebService.CarInfo.CarInfoEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserEntity toEntity(UserDto userDto);

    UserDto toDto(UserEntity userEntity);
}
