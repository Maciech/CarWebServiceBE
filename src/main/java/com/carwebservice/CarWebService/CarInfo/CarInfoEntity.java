package com.carwebservice.CarWebService.CarInfo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Blob;
import java.sql.Timestamp;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "CAR_INFO")
public class CarInfoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CAR_ID")
    private Long carId;

    @Column(name = "MAKE")
    private String make;

    @Column(name = "MODEL")
    private String model;

    @Column(name = "PRODUCTION_YEAR")
    private Integer productionYear;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "DESTINATION")
    private String destination;
    // przyda sie jak ktos bedzie chcial online zarezerwowac lub kupic samochod
    // zgodnie z przeznaczeniem samochodu moze byc dostepne na sprzedaz jak i pod wynajem
    // wiec trzeba bedzie sprawdzic dostepnosc

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
