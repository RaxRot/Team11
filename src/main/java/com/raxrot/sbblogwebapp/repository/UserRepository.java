package com.raxrot.sbblogwebapp.repository;

import com.raxrot.sbblogwebapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}