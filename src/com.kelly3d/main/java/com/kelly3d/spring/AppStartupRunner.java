package com.kelly3d.spring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.ParseException;

@Slf4j
@SpringBootApplication
public class AppStartupRunner {

    public static void main(String[] args) throws ParseException {
        SpringApplication.run(AppStartupRunner.class, args);
    }

}
