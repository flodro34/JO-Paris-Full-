package com.fdr.users_microservice.repositories;

import com.fdr.users_microservice.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository  extends JpaRepository<Role, Long> {

    Role findByRole(String role);
}
