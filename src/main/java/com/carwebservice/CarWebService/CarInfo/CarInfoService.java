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

    public List<CarInfoEntity> getAllActiveCarInfo() {
        return carInfoRepository.findAllByIsActive(1);
    }

    public CarInfoEntity createCarInfo(CarInfoDto carInfoDto) {
        return carInfoRepository.save(carInfoMapper.toEntity(updateGeneratedFields(carInfoDto)));
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
