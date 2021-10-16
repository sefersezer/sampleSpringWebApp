package org.example.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
public class Application extends SpringBootServletInitializer {
  public static void main(String[] args) {
    System.out.println("application starting for Levent");
    SpringApplication.run(Application.class, args);

  }

}
