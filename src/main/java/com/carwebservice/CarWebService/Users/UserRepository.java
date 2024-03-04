package com.carwebservice.CarWebService.Users;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

    Optional<UserEntity> findByIsActiveAndUserId(Integer isActive, Long userId);

    List<UserEntity> findAllByIsActive(Integer isActive);

    List<UserEntity> findAllByIsActiveAndIsAdmin(Integer isActive, Integer isAdmin);
}
