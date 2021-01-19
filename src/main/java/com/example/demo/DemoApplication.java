package com.example.demo;

import com.example.demo.model.Role;
import com.example.demo.model.User;
import com.example.demo.repository.RoleRepository;
import com.example.demo.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    /*@Bean
    public CommandLineRunner commandLineRunner(UserRepository userRepository, RoleRepository roleRepository) {

        return args -> {
            Role role1 = roleRepository.save(new Role("ADMINE_ROLE"));
            User user1 = userRepository.save(new User("admin", "admin", role1));

        };
    }*/

}
