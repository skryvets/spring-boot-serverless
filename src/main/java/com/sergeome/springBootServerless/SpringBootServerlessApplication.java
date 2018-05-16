package com.sergeome.springBootServerless;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = "com.sergeome.springBootServerless")
public class SpringBootServerlessApplication extends SpringBootServletInitializer {

    // silence console logging
    @Value("${logging.level.root:OFF}")
    String message = "";

    public static void main(String[] args) {
        SpringApplication.run(SpringBootServerlessApplication.class, args);
    }
}
