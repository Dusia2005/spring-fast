package org.example.beans;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class Pet {

    private String name;
    private String sound;


    @PostConstruct
    public void init() {
        this.name = "Myrka";
        this.sound = "Meo-ow";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSound(String say) {
        this.sound = say;
    }

    public void saySound() {
        System.out.println(sound);
    }

    @Override
    public String toString() {
        return "Pet : " + name;
    }
}
