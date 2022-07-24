package ru.esstu.firstspringbootapp;
//Next, we need to code the main class to run our Spring Boot web application. Create the SalesManager class as follows:
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//This program will start the embedded Tomcat server that hosts our Spring Boot web application.
@SpringBootApplication
public class SalesManager {

    public static void main(String[] args) {
        SpringApplication.run(SalesManager.class, args);
    }
}
