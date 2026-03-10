package org.example.config;

import org.example.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

@org.springframework.context.annotation.Configuration

public class ProjectConfig {

    @Primary
    @Bean
    Person Daria() {
        var d = new Person();

        d.setName("Daria");
        d.setSurname("Leshok");
        d.setAge(21);

        return d;
    }

    @Bean("Anatoli")
    Person Tolia() {
        var t = new Person();

        t.setName("Tolia");
        t.setSurname("Kovalev");
        t.setAge(21);

        return t;
    }

    @Bean
    Person Marek() {
        var m = new Person();

        m.setName("Marek");
        m.setSurname("Drobat");
        m.setAge(21);

        return m;
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
