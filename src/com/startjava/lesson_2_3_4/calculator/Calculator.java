package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class Calculator {
    private static int firstNumber;
    private static int secondNumber;
    private static char sign;
    private static String mathExpression;

    public Calculator(String mathExpression) {
        this.mathExpression = mathExpression;
    }

    public void setMathExpression(String mathExpression) {
        this.mathExpression = mathExpression;
    }

    public static void splitExpression() {
        Scanner sc = new Scanner(System.in);
        mathExpression = sc.nextLine();
        String[] partsExpression = mathExpression.split(" ");
        firstNumber = Integer.parseInt(partsExpression[0]);
        sign = partsExpression[1].charAt(0);
        secondNumber = Integer.parseInt(partsExpression[2]);
    }

    public static int calculate() {
        splitExpression();
        if (firstNumber < 0 || secondNumber < 0 || firstNumber % 1 != 0 || secondNumber % 1 != 0) {
            sign = ' ';
        }
        switch(sign) {
            case '+' -> System.out.println(firstNumber + secondNumber);
            case '-' -> System.out.println(Math.subtractExact(firstNumber, secondNumber));
            case '*' -> System.out.println(Math.multiplyExact(firstNumber, secondNumber));
            case '/' -> System.out.println((int) Math.floorDiv(firstNumber, secondNumber));
            case '%' -> System.out.println(firstNumber % secondNumber);
            case '^' -> System.out.println((int) Math.pow(firstNumber, secondNumber));
            default  -> System.out.println("Предупреждение, введите корректные значения!");
        }
        return 0;
    }
}