package org.example.config;

import org.example.component.Person;
import org.example.component.Pet;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    public Person Daria() {
        Person d = new Person();

        d.setName("Daria");
        d.setSurname("Leshok");
        d.setAge(21);
        d.setPet(cat());

        return d;
    }

    @Bean
    public Pet cat() {
        Pet c = new Pet();

        c.setName("Myrka");
        c.setSound("Meo-ow");

        return c;
    }

}
