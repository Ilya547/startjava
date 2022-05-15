package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private static float firstNumber;
    private static float secondNumber;
    private static char sign;

    public static String calculate(String mathExpression) {
        String[] partsExpression = mathExpression.split(" ");
        firstNumber = Float.parseFloat(partsExpression[0]);
        sign = partsExpression[1].charAt(0);
        secondNumber = Float.parseFloat(partsExpression[2]);
        if (firstNumber < 0 || secondNumber < 0 || firstNumber % 1 != 0 || secondNumber % 1 != 0) {
            sign = ' ';
        }
        return switch(sign) {
            case '+' -> String.valueOf(Math.addExact((int)firstNumber, (int)secondNumber));
            case '-' -> String.valueOf(Math.subtractExact((int) firstNumber, (int) secondNumber));
            case '*' -> String.valueOf(Math.multiplyExact((int) firstNumber, (int) secondNumber));
            case '/' -> String.valueOf(Math.floorDiv((int) firstNumber, (int) secondNumber));
            case '%' -> String.valueOf((int) firstNumber % (int) secondNumber);
            case '^' -> String.valueOf((int) Math.pow(firstNumber, secondNumber));

            case ' ' -> "Предупреждение! Используйте для вычислений только целые положительные числа\n";
            default -> throw new IllegalStateException("Unexpected value: " + sign);
        };

    }
}