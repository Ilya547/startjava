package com.startjava.lesson_2_3_4.robot;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger();
        jaegerOne.setModelName("Coyote Tango");
        jaegerOne.setMark("Mark-1");
        jaegerOne.setOrigin("Japan");
        jaegerOne.setHeight(85.34f);
        jaegerOne.setWeight(2.31f);
        jaegerOne.setStrenght(7);
        jaegerOne.setArmor(4);

        System.out.println("Мы создали первого робота в классе : " + jaegerOne.getModelName());
        System.out.println("Его сила равна :" + jaegerOne.getStrenght() + "; броня :" + jaegerOne.getArmor());
        System.out.println("Он может выполнять общие действия:");
        System.out.println(jaegerOne.scanKaiju());
        jaegerOne.killKaiju();

        Jaeger jaegerTwo = new Jaeger();
        jaegerTwo.setModelName("Gipsy Danger");
        jaegerTwo.setMark("Mark-3");
        jaegerTwo.setOrigin("USA");
        jaegerTwo.setHeight(79.25f);
        jaegerTwo.setWeight(1.98f);
        jaegerTwo.setStrenght(8);
        jaegerTwo.setArmor(6);

        System.out.println("Мы создали второго робота в классе : " + jaegerTwo.getModelName());
        System.out.println("Его сила равна :" + jaegerTwo.getStrenght() + "; броня :" + jaegerTwo.getArmor());
        System.out.println("Он может выполнять общие действия:");
        System.out.println(jaegerTwo.scanKaiju());
        jaegerTwo.killKaiju();
    }
}
