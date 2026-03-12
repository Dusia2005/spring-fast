package org.example.main;

import org.example.beans.Person;
import org.example.beans.Pet;
import org.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {

    public static void main(String[] args) {
        var context = new
                AnnotationConfigApplicationContext(ProjectConfig.class); //помещаем бины из ProjectConfig в context

        Person dasha = context.getBean(Person.class); // получаем бин Person
        Pet cat = context.getBean(Pet.class); // получаем бин Pet

        cat.saySound();
        System.out.println("Dasha's name: " + dasha.getName());
        System.out.println("Cat's name: " + cat.getName());
        System.out.println("Dasha's cat : " + dasha.getPet());

    }
}