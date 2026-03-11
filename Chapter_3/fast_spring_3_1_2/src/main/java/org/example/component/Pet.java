package org.example.component;

public class Pet {

    private String name;
    private String sound;

    public Pet() {
        System.out.println("Pet created!");
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
