package com.example.demo.service;

import javax.naming.spi.DirStateFactory.Result;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "result-service")
public interface ResultClient {
    @PostMapping("/results")
    Result addResult(@RequestBody Result result);
}

