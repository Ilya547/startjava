package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class Calculator {
    private int firstNumber;
    private int secondNumber;
    private char sign;
    private String mathExpression;

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public void setMathExpression(String mathExpression) {
        this.mathExpression = mathExpression;
    }

    public void splitExpression () {
        String[] partsExpression = mathExpression.split(" ");
        firstNumber = Integer.parseInt(partsExpression[0]);
        sign = partsExpression[1].charAt(0);
        secondNumber = Integer.parseInt(partsExpression[2]);
    }

    public int calculate() {
        Scanner sc = new Scanner(System.in);
        mathExpression = sc.nextLine();
        splitExpression();
        int result = 0;
        switch(sign) {
            case '+' :
                return firstNumber + secondNumber;
            case '-' :
                return Math.subtractExact(firstNumber, secondNumber);
            case '*' :
                return Math.multiplyExact(firstNumber, secondNumber);
            case '/' :
                return (int) Math.floorDiv(firstNumber, secondNumber);
            case '%' :
                return firstNumber % secondNumber;
            case '^' :
                return (int) Math.pow(firstNumber, secondNumber);
        }
        return result;
    }
}