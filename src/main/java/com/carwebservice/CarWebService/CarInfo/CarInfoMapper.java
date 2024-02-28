package com.carwebservice.CarWebService.CarInfo;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CarInfoMapper {

    CarInfoEntity toEntity(CarInfoDto carInfoDto);

    CarInfoDto toDto(CarInfoEntity carInfoEntity);
}
