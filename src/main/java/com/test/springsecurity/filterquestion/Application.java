package com.test.springsecurity.filterquestion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created on 8/7/17.
 */
@SpringBootApplication
@ComponentScan(
        basePackages = {"com.test.springsecurity"}
)
public class Application {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(Application.class);
        application.run(args);
    }
}
