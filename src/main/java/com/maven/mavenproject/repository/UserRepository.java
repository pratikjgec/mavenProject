package com.maven.mavenproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maven.mavenproject.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
