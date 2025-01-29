package com.raxrot.sbblogwebapp.repository;

import com.raxrot.sbblogwebapp.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}