package com.startjava.lesson_1.calculator;

public class Calculator {
    public static void main(String[] args) {
        //1.Калькулятор.
        System.out.println("1.Калькулятор");
        int a = 2;
        int b = 0;
        int result = 1;
        char sign = '^'; 
        if (sign == '+') {
            result = a + b;
        } else if (sign == '-') {
            result = a - b;
        } else if (sign == '*') {
            result = a * b;
        } else if (sign == '/') {
            result = a / b;
        } else if (sign == '%') {
            result = a % b;
        } else if (sign == '^') {
            if (b == 0) {
                result = 1;
            }
            for (int i = 1; i < b; i++) {
                result *= a;
            }
        } 
        System.out.println(a + " " + sign + " " + b + " = " + result);
    }
}