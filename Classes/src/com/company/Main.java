package com.company;

public class Main {

    public static void main(String[] args) {

      /*  Car porche = new Car();
        Car holden = new Car();
        porche.setModel("9122");
        System.out.println("Model is " + porche.getModel());
        porche.setModel("Carrera");
        System.out.println("Model is " + porche.getModel()); */

        Person person = new Person();
        person.setFirstName("");   // firstName is set to empty string
        person.setLastName("");    // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John");    // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith");    // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());


    }
}
