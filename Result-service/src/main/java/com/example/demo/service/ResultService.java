package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ResultRepository;
import com.example.demo.entity.Result;

@Service
public class ResultService {
    @Autowired
    private ResultRepository resultRepository;

    public Result saveResult(Result result) {
        return resultRepository.save(result);
    }

    public Optional<Result> getResultByRollNumber(String rollNumber) {
        return resultRepository.findByRollNumber(rollNumber);
    }

    public String determineResult(int marks) {
        return marks >= 40 ? "Pass" : "Fail";
    }
}
