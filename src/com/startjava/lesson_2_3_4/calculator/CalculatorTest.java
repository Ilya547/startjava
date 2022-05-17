package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String reply = "yes";
        while (reply.equals("yes")) {
            System.out.print("Введите математическое выражение:");
            String mathExpression = sc.nextLine();
            try {
                System.out.print("Результат математического выражения: \n" + Calculator.calculate(mathExpression));
            } catch (NumberFormatException e) {
                System.err.println("Предупреждение! Используйте для вычислений целые числа!\n");
            } catch (IllegalArgumentException e) {
                System.err.println("Предупреждение! Используйте для вычислений положительные числа!\n");
            } catch (IllegalStateException e) {
                System.err.println("Предупреждение! Используйте для вычислений знаки: '+' '-' '*' '/' '%' '^'\n");
            }
            do {
                System.out.println("\nХотите продолжить вычисления? [yes/no]:");
                reply = sc.nextLine();
            } while (!reply.equals("yes") && !reply.equals("no"));
        }
    }
}