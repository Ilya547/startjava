package com.startjava.lesson_2_3_4.calculator;

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

    public void splitString () {
        String[] partsString = mathExpression.split(" ");
        firstNumber = Integer.parseInt(partsString[0]);
        sign = partsString[1].charAt(0);
        secondNumber = Integer.parseInt(partsString[2]);
    }

    public int calculate() {
        int result = 1;
        switch(sign) {
            case '+' :
                result = firstNumber + secondNumber;
                break;
            case '-' :
                result = Math.subtractExact(firstNumber, secondNumber);
                break;
            case '*' :
                result = Math.multiplyExact(firstNumber, secondNumber);
                break;
            case '/' :
                result = (int) Math.floorDiv(firstNumber, secondNumber);
                break;
            case '%' :
                result = firstNumber % secondNumber;
                break;
            case '^' :
                result = (int) Math.pow(firstNumber, secondNumber);
                break;
        }
        return result;
    }
}