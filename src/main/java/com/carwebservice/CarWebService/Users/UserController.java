package com.carwebservice.CarWebService.Users;

import com.carwebservice.CarWebService.CarInfo.CarInfoDto;
import com.carwebservice.CarWebService.CarInfo.CarInfoEntity;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@AllArgsConstructor
public class UserController {

    UserService userService;

    @GetMapping("/getAllUsers")
    public ResponseEntity<List<UserEntity>> getAllUsers() {
        return ResponseEntity.status(HttpStatus.OK).body(userService.getAllActiveUsers());
    }

    @GetMapping("/getUser/{userId}")
    public ResponseEntity<UserEntity> getUserById(@PathVariable Long userId) {
        return ResponseEntity.status(HttpStatus.OK).body(userService.getActiveUserById(userId));
    }

    @PostMapping("/createUser")
    public ResponseEntity<UserEntity> createUser(@RequestBody UserDto userDto) {
        return ResponseEntity.status(HttpStatus.OK).body(userService.createUser(userDto));
    }
}
