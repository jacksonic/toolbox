package it.fds.toolbox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Start {

    public static void main(String[] args) {

        SpringApplication app = new SpringApplication(Start.class);
        app.run(args);
    }
}