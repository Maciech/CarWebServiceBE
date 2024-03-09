package com.carwebservice.CarWebService.CarInfo;

import jakarta.transaction.Transactional;
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

    public CarInfoEntity getCarById(Long carId) {
        return carInfoRepository.findById(carId).orElseThrow();
    }

    @Transactional
    public CarInfoEntity createCarRecord(CarInfoDto carInfoDto) {
        return carInfoRepository.save(carInfoMapper.toEntity(updateGeneratedFields(carInfoDto)));
    }

    @Transactional
    public CarInfoEntity updateCarRecord(CarInfoDto carInfoDto) {
        return carInfoRepository.save(carInfoMapper.toEntity(updateGeneratedFields(carInfoDto)));
    }

    @Transactional
    public CarInfoEntity changeStatus(Long id, String status) {
        CarInfoEntity carInfoEntity = carInfoRepository.findById(id).orElseThrow();
        carInfoEntity.setStatus(status);
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
