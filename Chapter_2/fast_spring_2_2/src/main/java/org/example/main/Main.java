package org.example.main;

import org.example.component.Person;
import org.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        var context = new
                AnnotationConfigApplicationContext(ProjectConfig.class);

        Person Daria = context.getBean(Person.class);

        System.out.println(Daria);
    }
}