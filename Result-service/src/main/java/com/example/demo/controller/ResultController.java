package com.example.demo.controller;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Result;
import com.example.demo.service.ResultService;

@RestController
@RequestMapping("/results")
public class ResultController {
    @Autowired
    private ResultService resultService;

    @PostMapping
    public ResponseEntity<Result> addResult(@RequestBody Result result) {
        String status = resultService.determineResult(result.getMarks());
        result.setStatus(status);
        Result savedResult = resultService.saveResult(result);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedResult);
    }

    @GetMapping("/{rollNumber}")
    public ResponseEntity<Result> getResult(@PathVariable String rollNumber) {
        Optional<Result> result = resultService.getResultByRollNumber(rollNumber);
        return result.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}

