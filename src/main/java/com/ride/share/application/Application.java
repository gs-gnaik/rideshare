package com.ride.share.application;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by gnaik on 18/04/17.
 */

@Slf4j
@Configuration
@SpringBootApplication
@ComponentScan("com.ride.share.controller,com.ride.share.service,com.ride.share.repository,com.ride.share.data")
public class Application {
    public static void main(String args[]){
        log.info("Happy Ride sharing!!");
        SpringApplication.run(Application.class, args);
    }
}
