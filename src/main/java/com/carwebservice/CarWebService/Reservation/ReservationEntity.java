package com.carwebservice.CarWebService.Reservation;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.sql.Timestamp;

@Data
@Entity(name = "RESERVATIONS")
public class ReservationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RECORD_ID")
    private Long recordId;

    @Column(name = "CAR_ID")
    private Long carId;

    @Column(name = "USER_ID")
    private Long userId;

    @Column(name = "RESERVATION_TIME")
    private Date reservationTime;

    @Column(name = "COST")
    private Double cost;

    @Column(name = "DRIVER")
    private String driver;

    @Column(name = "IS_ACTIVE")
    private Integer isActive;
    @Column(name = "CREATED_BY")
    private String createdBy;
    @Column(name = "CREATED_DATE")
    private Timestamp createdDate;
    @Column(name = "LAST_UPDATED_BY")
    private String lastUpdatedBy;
    @Column(name = "LAST_UPDATED_DATE")
    private Timestamp lastUpdatedDate;
}
