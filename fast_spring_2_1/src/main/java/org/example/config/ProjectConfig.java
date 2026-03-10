package org.example.config;

import org.example.Person;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration

public class ProjectConfig {

    @Bean
    Person Daria() {
        var d = new Person();

        d.setName("Daria");
        d.setSurname("Leshok");
        d.setAge(21);

        return d;
    }

    @Bean
    String helloWord() {
        return "Hello, World!";
    }

    @Bean
    Integer eight() {
        return 8;
    }
}
