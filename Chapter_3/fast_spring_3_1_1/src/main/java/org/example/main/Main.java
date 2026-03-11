package org.example.main;

import org.example.component.Person;
import org.example.component.Pet;
import org.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {

    public static void main(String[] args) {
        var context = new
                AnnotationConfigApplicationContext(ProjectConfig.class);

        Person dasha = context.getBean(Person.class);
        Pet cat = context.getBean(Pet.class);

        cat.saySound();
        System.out.println("Dasha's cat : " + dasha.getPet());

    }
}