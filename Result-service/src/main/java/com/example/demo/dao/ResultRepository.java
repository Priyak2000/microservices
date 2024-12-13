package com.example.demo.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Result;

@Repository
public interface ResultRepository extends JpaRepository<Result, Long> {
    Optional<Result> findByRollNumber(String rollNumber);
}

