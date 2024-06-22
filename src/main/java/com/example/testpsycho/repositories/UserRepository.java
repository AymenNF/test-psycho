package com.example.testpsycho.repositories;

import com.example.testpsycho.entities.UserApp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserApp, Long> {
    UserApp findByUsername(String username);
}

