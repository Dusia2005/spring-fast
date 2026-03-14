package org.example.beans;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {

    private String name;
    private String surname;
    private int age;

    private Pet pet;

    @PostConstruct
    public void init() {
        this.name = "Daria";
        this.surname = "Leshok";
        this.age = 21;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0 || age >= 120) {
            System.out.println("Такого не может быть О_о");
        } else {
            this.age = age;
        }
    }

    public Pet getPet() {
        return pet;
    }

    @Autowired
    public void setPet(Pet pet) {
        this.pet = pet;
    } // внедрение Pet через setter

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }

}
