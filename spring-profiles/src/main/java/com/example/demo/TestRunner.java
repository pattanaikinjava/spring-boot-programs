package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestRunner  implements CommandLineRunner {


    @Value("${spring.profiles.active}") private String profileActive;
    @Value("${spring.application.message}") private String profileActiveName;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("FOLLOWING PROFILE ACTIVE :");
        System.out.println(profileActive);
        System.out.println("FOLLOWING PROFILE ACTIVE NAME :");
        System.out.println(profileActiveName);

    }
}
