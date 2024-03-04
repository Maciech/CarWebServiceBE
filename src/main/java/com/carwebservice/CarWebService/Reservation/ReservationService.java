package com.carwebservice.CarWebService.Reservation;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class ReservationService {
    ReservationRepository reservationRepository;
    ReservationMapper reservationMapper;

    public ReservationEntity getReservationByUserId(Long userId) {
        return reservationRepository.findByIsActiveAndUserId(1, userId).orElseThrow();
    }

    public List<ReservationEntity> getAllReservations() {
        return reservationRepository.findAllByIsActive(1);
    }

    public ReservationEntity createReservation(ReservationDto reservationDto) {
        return reservationRepository.save(reservationMapper.toEntity(updateGeneratedFields(reservationDto)));
    }

    private ReservationDto updateGeneratedFields(ReservationDto reservationDto) {
        Timestamp currentTime = Timestamp.from(Instant.now());
        String user = "Test User";
        reservationDto.setIsActive(1);
        reservationDto.setCreatedBy(user);
        reservationDto.setCreatedDate(currentTime);
        reservationDto.setLastUpdatedBy(user);
        reservationDto.setLastUpdatedDate(currentTime);
        return reservationDto;
    }
}
