package org.example.main;

import org.example.component.Person;
import org.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        var context = new
                AnnotationConfigApplicationContext(ProjectConfig.class);

        Person person = new Person();
        Supplier<Person> personSupplier = () -> person;

        context.registerBean("Daria",
                Person.class,
                personSupplier,
                bc -> bc.setPrimary(true));
        Person Daria = context.getBean(Person.class);

        System.out.println(Daria);

    }
}