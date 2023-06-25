package edu.goit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Module15SpringSecurityApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Module15SpringSecurityApplication.class, args);
    }

}
