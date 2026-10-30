package com.Foodloop.Backend.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.Foodloop.Backend.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}