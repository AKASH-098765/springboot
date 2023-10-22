package com.example.jpa_demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpa_demo.entities.User;

public interface UserRepository extends JpaRepository<User,Integer> {

}
