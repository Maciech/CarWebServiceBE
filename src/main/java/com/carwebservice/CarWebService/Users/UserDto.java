package com.carwebservice.CarWebService.Users;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.sql.Timestamp;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserDto {

    Long userId;

    String firstName;

    String lastName;

    Date dateOfBirth;

    String email;

    Integer phoneNumber;

    String password;

    Integer isAdmin;

    Integer isActive;

    String createdBy;

    Timestamp createdDate;

    String lastUpdatedBy;

    Timestamp lastUpdatedDate;
}
