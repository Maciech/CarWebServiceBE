package com.carwebservice.CarWebService.Users;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class UserService {
    UserRepository userRepository;
    UserMapper userMapper;

    public List<UserEntity> getAllActiveUsers() {
        return userRepository.findAllByIsActive(1);
    }

    public UserEntity getActiveUserById(Long userId) {
        return userRepository.findByIsActiveAndUserId(1, userId).orElseThrow();
    }

    public UserEntity createUser(UserDto userDto) {
        return userRepository.save(userMapper.toEntity(updateGeneratedFields(userDto)));
    }

    private UserDto updateGeneratedFields(UserDto userDto) {
        Timestamp currentTime = Timestamp.from(Instant.now());
        String user = "Test User";
        userDto.setIsActive(1);
        userDto.setCreatedBy(user);
        userDto.setCreatedDate(currentTime);
        userDto.setLastUpdatedBy(user);
        userDto.setLastUpdatedDate(currentTime);
        return userDto;
    }
}
