package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private static float firstNumber;
    private static float secondNumber;
    private static char sign;

    public static void calculate(String mathExpression) {
        String[] partsExpression = mathExpression.split(" ");
        firstNumber = Float.parseFloat(partsExpression[0]);
        sign = partsExpression[1].charAt(0);
        secondNumber = Float.parseFloat(partsExpression[2]);
        if (firstNumber < 0 || secondNumber < 0 || firstNumber % 1 != 0 || secondNumber % 1 != 0) {
            sign = ' ';
        }
        switch(sign) {
            case '+' -> System.out.println(Math.addExact((int)firstNumber, (int)secondNumber));
            case '-' -> System.out.println(Math.subtractExact((int) firstNumber, (int) secondNumber));
            case '*' -> System.out.println(Math.multiplyExact((int) firstNumber, (int) secondNumber));
            case '/' -> System.out.println(Math.floorDiv((int) firstNumber, (int) secondNumber));
            case '%' -> System.out.println((int) firstNumber % (int) secondNumber);
            case '^' -> System.out.println(Math.pow((int) firstNumber, (int) secondNumber));
            default -> System.out.println("Предупреждение, введите корректные значения!");
        }
    }
}