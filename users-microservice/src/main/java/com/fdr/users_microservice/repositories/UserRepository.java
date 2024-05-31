package com.fdr.users_microservice.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.fdr.users_microservice.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
    User findByUsername(String username);

}
