package com.company;

public class Main {

    public static void main(String[] args) {

        Animals animals = new Animals("Animal",1,1,5,5);
        Dog dog = new Dog ("Yorkie", 8,20,2,4,1,20,"Long silky");
        //dog.eat();
        //dog.walk();
        dog.run();

    }
}