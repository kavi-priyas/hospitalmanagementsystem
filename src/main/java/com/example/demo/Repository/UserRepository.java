package com.example.demo.Repository;

import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {
    // If you need some basic methods on User, you can add them here, like find by username
    User findByUsername(String username);
}


