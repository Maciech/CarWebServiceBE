package com.carwebservice.CarWebService.Reservation;

import com.carwebservice.CarWebService.Users.UserEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ReservationMapper {

    ReservationEntity toEntity(ReservationDto reservationDto);

    ReservationDto toDto(ReservationEntity reservationEntity);
}
