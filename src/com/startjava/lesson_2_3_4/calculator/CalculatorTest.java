package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

import static com.startjava.lesson_2_3_4.calculator.Calculator.calculate;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String reply = "yes";
        while (reply.equals("yes")) {
            System.out.print("Введите математическое выражение:");
            Calculator.mathExpression = sc.nextLine();
            System.out.println("Результат математического выражения: " + calculate());
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                reply = sc.nextLine();
            } while (!reply.equals("yes") && !reply.equals("no"));
        }
    }
}