package org.example;

public interface Animal {
    void eat();
    void sound();
}

interface Pet extends Animal {
    void play();
}