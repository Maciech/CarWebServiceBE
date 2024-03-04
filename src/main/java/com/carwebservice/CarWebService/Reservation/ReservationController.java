package com.carwebservice.CarWebService.Reservation;

import com.carwebservice.CarWebService.Users.UserEntity;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@AllArgsConstructor
public class ReservationController {

    ReservationService reservationService;

    @GetMapping("/getReservation/{userId}")
    public ResponseEntity<ReservationEntity> getReservationByUserId(@PathVariable Long userId) {
        return ResponseEntity.status(HttpStatus.OK).body(reservationService.getReservationByUserId(userId));
    }

    @GetMapping("/getAllReservations")
    public ResponseEntity<List<ReservationEntity>> getAllReservations() {
        return ResponseEntity.status(HttpStatus.OK).body(reservationService.getAllReservations());
    }

    @PostMapping("/createReservation")
    public ResponseEntity<ReservationEntity> createReservation(@RequestBody ReservationDto reservationDto) {
        return ResponseEntity.status(HttpStatus.OK).body(reservationService.createReservation(reservationDto));
    }
}
