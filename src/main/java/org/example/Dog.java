package org.example;
import java.awt.*;

class Dog implements Animal, Pet {
    @Override
    public void eat() {
        System.out.println("щеночки едят корм");
    }
    @Override
    public void sound() {
        System.out.println("гав");
        Toolkit.getDefaultToolkit().beep();
    }
    @Override
    public void play() {
        System.out.println("играть с щеночком");
    }
}
