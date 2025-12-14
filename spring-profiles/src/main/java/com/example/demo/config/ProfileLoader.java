//package com.example.demo.config;
//
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.env.EnvironmentPostProcessor;
//import org.springframework.core.env.ConfigurableEnvironment;
//import org.springframework.core.io.support.ResourcePropertySource;
//import org.springframework.core.env.PropertySource;
//
//public class ProfileLoader implements EnvironmentPostProcessor {
//
//    @Override
//    public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {
//        String active = environment.getProperty("spring.profiles.active");
//
//        if (active == null || active.isBlank()) {
//            System.out.println("No active profile selected.");
//            return;
//        }
//
//        String location = "file:profiles/" + active + "/application-" + active + ".properties";
//
//        System.out.println(">>> Loading profile config: " + location);
//
//        try {
//            PropertySource<?> ps = new ResourcePropertySource(location);
//            environment.getPropertySources().addLast(ps);
//        } catch (Exception e) {
//            System.out.println("❌ Failed to load: " + location);
//            throw new RuntimeException("Could not load external profile config", e);
//        }
//    }
//}
