package com.estsoft.springbootwebservice1.Repository;

import com.estsoft.springbootwebservice1.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}