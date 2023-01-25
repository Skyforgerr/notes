package com.example.notes.repository;

import com.example.notes.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Ivan 16.01.2023
 */
public interface RoleRepository extends JpaRepository<Role, Long> {
}
