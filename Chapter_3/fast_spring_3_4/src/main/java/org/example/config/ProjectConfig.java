package org.example.config;


import org.example.beans.Person;
import org.example.beans.Pet;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    public Pet cat1() {
        Pet c = new Pet();
        c.setName("Myrka");
        c.setSound("Meo-ow");
        return c;
    }

    @Bean
    public Pet cat2() {
        Pet c = new Pet();
        c.setName("Barsik");
        c.setSound("Meo-oww");
        return c;
    }

    @Bean
    public Person dasha(
        @Qualifier("cat2") Pet cat) {

            Person d = new Person();
            d.setName("Daria");
            d.setSurname("Leshok");
            d.setAge(21);
            d.setPet(cat);
            return d;
        }
}
