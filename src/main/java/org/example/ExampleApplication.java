package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Simple SpringBootMain-Application, that runs an embedded-Tomcat on port 9090
 * and offers some REST-services "service" (others are mapped in various *Controller-classes).
 */
@SpringBootApplication
public class ExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExampleApplication.class, args);
    }
}
