package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);
        String reply = "yes";
        while (reply.equals("yes")) {
            System.out.print("Введите математическое выражение:");
            System.out.println("Результат математического выражения: " + calculator.calculate());
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                reply = sc.nextLine();
            } while (!reply.equals("yes") && !reply.equals("no"));
        }
    }
}