package org.example;
import java.awt.*;
class Cat implements Animal, Pet {
    @Override
    public void eat() {
        System.out.println("котики едят рыбу");

    }
    @Override
    public void sound() {
        System.out.println("мяу");
        Toolkit.getDefaultToolkit().beep();
    }
    @Override
    public void play() {
        System.out.println("играть c котиком");
    }
}
