package com.startjava.lesson_2_3_4.person;

public class Person {

    String gender = "man";
    String name = "Alex";
    int height = 190;
    int weight = 77;
    int age = 100;

    public void walk() {
        System.out.println("идти");
    }

    public void sit() {
        System.out.println("сидеть");
    }

    public void run() {
        System.out.println("бежать");
    }

    public void talk() {
        System.out.println("говорить");
    }

    public void learnJava() {
        System.out.println("учить Java");
    }
}