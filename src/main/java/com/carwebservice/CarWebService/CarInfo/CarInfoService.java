package com.carwebservice.CarWebService.CarInfo;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class CarInfoService {
    CarInfoRepository carInfoRepository;
    CarInfoMapper carInfoMapper;

    public List<CarInfoEntity> getAllActiveCars() {
        return carInfoRepository.findAllByIsActive(1);
    }

    public List<CarInfoEntity> getAllActiveCarsByMake(String make) {
        return carInfoRepository.findAllByIsActiveAndMake(1, make);
    }

    public CarInfoEntity createCarRecord(CarInfoDto carInfoDto) {
        CarInfoEntity carInfoEntity = CarInfoEntity.builder()
                .make(carInfoDto.getMake())
                .model(carInfoDto.getModel())
                .productionYear(carInfoDto.getProductionYear())
                .isActive(1)
                .build();
        return carInfoRepository.save(carInfoEntity);
    }

    private CarInfoDto updateGeneratedFields(CarInfoDto carInfoDto) {
        Timestamp currentTime = Timestamp.from(Instant.now());
        String user = "Test User";
        carInfoDto.setIsActive(1);
        carInfoDto.setCreatedBy(user);
        carInfoDto.setCreatedDate(currentTime);
        carInfoDto.setLastUpdatedBy(user);
        carInfoDto.setLastUpdatedDate(currentTime);
        return carInfoDto;
    }
}
