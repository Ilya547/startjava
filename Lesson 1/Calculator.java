public class Calculator {
    public static void main(String[] args) {
        //1.Калькулятор
        System.out.println("1.Калькулятор");
        int a = 2;
        int b = 8;
        char sign = '^'; 
        int result = a;
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
            for (int i = 1; i < b; i++) {
                result *= a;
            }
        } 
        System.out.println(a + " " + sign + " " + b + " = " + result);
        System.out.print("1 + 2 = Java");
    }
}