package org.example.bookms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// TODO: Enable Feign Clients
public class BookmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookmsApplication.class, args);
    }

}
