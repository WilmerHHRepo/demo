package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Validated
public class HealthCheckController
{

    Logger logger = LoggerFactory.getLogger(HealthCheckController.class);


    @GetMapping("/heartbeat")
    public ResponseEntity<String> HeardBeat(){

        logger.info("se invoco logger");

        logger.info("se invoco logger whh");
        return ResponseEntity.ok("HearBeat OK");
    }



}
