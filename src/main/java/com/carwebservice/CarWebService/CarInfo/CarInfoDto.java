package com.carwebservice.CarWebService.CarInfo;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.sql.Blob;
import java.sql.Timestamp;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CarInfoDto {

    Long carId;
    String make;
    String model;
    Integer productionYear;
    List<String> status;
    List<String> destination;
    Blob image;
    Integer isActive;
    String createdBy;
    String lastUpdatedBy;
    Timestamp createdDate;
    Timestamp lastUpdatedDate;
}
