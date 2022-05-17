package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private static int firstNumber;
    private static int secondNumber;
    private static char sign;

    public static int calculate(String mathExpression) {
        String[] partsExpression = mathExpression.split(" ");
        firstNumber = Integer.parseInt(partsExpression[0]);
        sign = partsExpression[1].charAt(0);
        secondNumber = Integer.parseInt(partsExpression[2]);
        if (firstNumber < 0 || secondNumber < 0) {
            throw new IllegalArgumentException();
        }
        return switch(sign) {
            case '+' -> Math.addExact(firstNumber, secondNumber);
            case '-' -> Math.subtractExact(firstNumber, secondNumber);
            case '*' -> Math.multiplyExact(firstNumber, secondNumber);
            case '/' -> Math.floorDiv(firstNumber, secondNumber);
            case '%' -> firstNumber % secondNumber;
            case '^' -> (int) Math.pow(firstNumber, secondNumber);
            default -> throw new IllegalStateException();
        };
    }
}