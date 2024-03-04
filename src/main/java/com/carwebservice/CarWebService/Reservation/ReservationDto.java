package com.carwebservice.CarWebService.Reservation;

import jakarta.persistence.Column;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.sql.Date;
import java.sql.Timestamp;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ReservationDto {

    Long recordId;

    Long carId;

    Long userId;

    Date reservationTime;

    Double cost;

    String driver;

    Integer isActive;

    String createdBy;

    Timestamp createdDate;

    String lastUpdatedBy;

    Timestamp lastUpdatedDate;
}
