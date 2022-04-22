package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);
        String reply = "yes";
        while (reply.equals("yes")) {
            System.out.println("Введите первое число:");
            calculator.setFirstNumber(sc.nextInt());

            System.out.println("Введите знак математической операции:");
            calculator.setSign(sc.next().charAt(0));

            System.out.println("Введите второе число:");
            calculator.setSecondNumber(sc.nextInt());

            System.out.println("Результат: " + calculator.calculate());
                        
            do {
                reply = sc.nextLine();
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
            } while ((!reply.equals("yes")) && (!reply.equals("no")));
        }
    }
}