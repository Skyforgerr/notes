package com.example.notes.repository;

import com.example.notes.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Ivan 16.01.2023
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
