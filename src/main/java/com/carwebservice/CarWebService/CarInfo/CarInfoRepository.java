package com.carwebservice.CarWebService.CarInfo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarInfoRepository extends JpaRepository<CarInfoEntity, Long> {

    List<CarInfoEntity> findAllByIsActive(Integer isActive);
}
