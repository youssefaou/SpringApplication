package com.example.demo.repository;

import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface UserRepository extends JpaRepository<User,Integer> {

    //public User getUser(int id);

    public User findUserByUsername(String username);

    //public List<User> findUserByRole(String Role);
}
