package com.carwebservice.CarWebService.CarInfo;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.sql.Timestamp;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CarInfoDto {

    Long carId;
    String brand;
    String model;
    Integer productionYear;
    List<String> status;
    List<String> destination;
    Integer isActive;
    String createdBy;
    String lastUpdatedBy;
    Timestamp createdDate;
    Timestamp lastUpdatedDate;
}
