package com.carwebservice.CarWebService.CarInfo;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@AllArgsConstructor
public class CarInfoController {

    CarInfoService carInfoService;

    @GetMapping("/getAllCarInfo")
    public ResponseEntity<List<CarInfoEntity>> getAllCarInfo() {
        return ResponseEntity.status(HttpStatus.OK).body(carInfoService.getAllActiveCarInfo());
    }

    @PostMapping("/createCarInfo")
    public ResponseEntity<CarInfoEntity> createCarInfo(@RequestBody CarInfoDto carInfoDto) {
        return ResponseEntity.status(HttpStatus.OK).body(carInfoService.createCarInfo(carInfoDto));
    }
}
