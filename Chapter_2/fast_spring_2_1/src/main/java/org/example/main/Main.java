package org.example.main;

import org.example.Person;
import org.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person Daria = context.getBean(Person.class);
        System.out.println(Daria);

        Person Marek = context.getBean( "Marek",Person.class);
        System.out.println(Marek);

        Person Tolia = context.getBean( "Anatoli",Person.class);
        System.out.println(Tolia);

    }
}