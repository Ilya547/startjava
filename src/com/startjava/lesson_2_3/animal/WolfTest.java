package com.startjava.lesson_2_3.animal;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.setGender("man");
        wolfOne.setNickname("Gocha");
        wolfOne.setWeight(59);
        wolfOne.setAge(3);
        wolfOne.setColor("Grey");

        System.out.println("Мы создали волка!" + "\nего имя: " + wolfOne.getNickname() + "\nего цвет: " + wolfOne.getColor() + "\nего вес: " + wolfOne.getWeight() + " кг" );

        wolfOne.walk();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();


    }
}