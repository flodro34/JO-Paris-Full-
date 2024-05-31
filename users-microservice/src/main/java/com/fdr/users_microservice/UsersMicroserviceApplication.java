package com.fdr.users_microservice;

import com.fdr.users_microservice.entities.Role;
import com.fdr.users_microservice.entities.User;
import com.fdr.users_microservice.services.UserService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class UsersMicroserviceApplication {

	@Autowired
	UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(UsersMicroserviceApplication.class, args);
	}

//	@PostConstruct
//	void init_users() {
//		//add roles
////		userService.addRole(new Role(null, "ADMIN"));
////		userService.addRole(new Role(null, "USER"));
//		//add users
//
//		userService.saveUser(new User(null,"Bob","456",true,null));
//		userService.saveUser(new User(null,"Tea","456",true,null));


//		//add role to users
//
//		userService.addRoleToUser("Bob", "USER");
//		userService.addRoleToUser("Tea", "USER");

//	}




}
