package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private static float firstNumber;
    private static float secondNumber;
    private static char sign;

    public static int calculate() {
        splitExpression();
        if (firstNumber < 0 || secondNumber < 0 || firstNumber % 1 != 0 || secondNumber % 1 != 0) {
            sign = ' ';
        }
        switch(sign) {
            case '+' : return (int) (firstNumber + secondNumber);
            case '-' : return Math.subtractExact((int) firstNumber, (int) secondNumber);
            case '*' : return Math.multiplyExact((int) firstNumber, (int) secondNumber);
            case '/' : return Math.floorDiv((int) firstNumber, (int) secondNumber);
            case '%' : return ((int) firstNumber + (int) secondNumber);
            case '^' : return (int) Math.pow(firstNumber, secondNumber);
            default : System.out.println("Предупреждение, введите корректные значения!");
        }
        return 0;
    }

    private static void splitExpression() {
        String[] partsExpression = CalculatorTest.mathExpression.split(" ");
        firstNumber = Float.parseFloat(partsExpression[0]);
        sign = partsExpression[1].charAt(0);
        secondNumber = Float.parseFloat(partsExpression[2]);
    }
}