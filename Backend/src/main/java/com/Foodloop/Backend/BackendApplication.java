package com.Foodloop.Backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class BackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendApplication.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void printStartupMessage(ApplicationReadyEvent event) {
        System.out.println("\n------------------------------------------------------------");
        System.out.println(" 🚀 FoodLoop Application is Live & Running!");
        System.out.println(" Open your browser at: http://localhost:8082");
        System.out.println("------------------------------------------------------------\n");
    }
}