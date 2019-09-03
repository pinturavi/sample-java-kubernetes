package com.example.javasample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@SpringBootApplication
public class JavaSampleApplication {

    public static void main(String[] args) throws IOException {

        SpringApplication.run(JavaSampleApplication.class, args);
        String path = System.getenv("LOCATION");
        Files.readAllLines(Paths.get(path)).forEach(System.out::println);
    }

}
