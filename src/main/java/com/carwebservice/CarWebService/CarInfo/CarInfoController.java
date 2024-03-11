package com.carwebservice.CarWebService.CarInfo;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
@AllArgsConstructor
public class CarInfoController {

    CarInfoService carInfoService;

    @GetMapping("/getAllCars")
    public ResponseEntity<List<CarInfoEntity>> getAllCarsInfo() {
        return ResponseEntity.status(HttpStatus.OK).body(carInfoService.getAllActiveCars());
    }

    @GetMapping("/getAllCarsByMake/{make}")
    public ResponseEntity<List<CarInfoEntity>> getAllCarsByMake(@PathVariable String make) {
        return ResponseEntity.status(HttpStatus.OK).body(carInfoService.getAllActiveCarsByMake(make));
    }

    @GetMapping("/getCar/{carId}")
    public ResponseEntity<CarInfoEntity> getCarById(@PathVariable Long carId) {
        return ResponseEntity.status(HttpStatus.OK).body(carInfoService.getCarById(carId));
    }

    @PostMapping("/createCar")
    public ResponseEntity<CarInfoEntity> createCarInfo(@RequestBody CarInfoDto carInfoDto) {
        return ResponseEntity.status(HttpStatus.OK).body(carInfoService.createCarRecord(carInfoDto));
    }

    @PutMapping("/updateCar")
    public ResponseEntity<CarInfoEntity> updateCarInfo(@RequestBody CarInfoDto carInfoDto) {
        return ResponseEntity.status(HttpStatus.OK).body(carInfoService.updateCarRecord(carInfoDto));
    }
}
