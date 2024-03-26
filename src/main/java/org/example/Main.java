package org.example;

/* лаба 5: создайте интерфейс Animal, который содержит методы eat() и sound().
   Создайте классы, реализующие интерфейс Animal:
   Dog: переопределите метод eat(), и sound() для вывода "Гав".
   Cat: переопределите метод eat() для вывода информации о еде и sound() для вывода "Мяу".
   Создайте интерфейс Pet, расширяющий Animal, и добавьте в него метод play().
   Реализуйте интерфейс Pet для классов Dog и Cat.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("котики (2)?? или щеночки (1)? или выход (3)???");
            int ch = sc.nextInt();
            Dog dog = new Dog();
            Cat cat = new Cat();

            switch (ch){
                case 1:
                    dog.eat();
                    dog.play();
                    dog.sound();
                    break;
                case 2:
                    cat.eat();
                    cat.play();
                    cat.sound();
                    break;
                case 3:
                    System.out.println("пока-пока");
                    System.exit(0);
                    break;
            }
        }
    }
}