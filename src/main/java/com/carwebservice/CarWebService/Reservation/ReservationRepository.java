package com.carwebservice.CarWebService.Reservation;

import com.carwebservice.CarWebService.Users.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ReservationRepository extends JpaRepository<ReservationEntity, Long> {

    Optional<ReservationEntity> findByIsActiveAndUserId(Integer isActive, Long userId);

    List<ReservationEntity> findAllByIsActive(Integer isActive);
}
