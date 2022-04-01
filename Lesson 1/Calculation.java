public class Calculation {
    public static void main(String[] args) {
        //1.Калькулятор
        System.out.println("1.Калькулятор");
        int a = 2;
        int b = 8;
        int j = a;
        char sign = '^'; 
        int result = 0;
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
                j = j * a;
            }
            result = j;
        } 
        System.out.println(a + " " + sign + " " + b + " = " + result);

        //2. Игра “Угадай число”
        System.out.println("2.Игра “Угадай число”");
        int srcNum = 100;
        int srcNumPrev = 100;
        int y = 99;
        srcNum /= 2;
        while ((srcNumPrev - srcNum) / 2 > 1) {
            System.out.print(srcNum);
             if (srcNum > y) {
                System.out.print(" данное число больше того, что загадал компьютер\n");
                srcNum = srcNum - (srcNumPrev - srcNum) / 2;
                srcNumPrev /= 2;
            } else if (srcNum < y) {
                System.out.print(" данное число меньше того, что загадал компьютер\n");
                srcNum = srcNum + (srcNumPrev - srcNum) / 2;
            } else if (srcNum == y) {
                break;
            }
        }
        while (srcNum != y) {
            System.out.print(srcNum);
            if (srcNum > y) {
                System.out.print(" @данное число больше того, что загадал компьютер\n");
                srcNum -= 1; 
            } else if (srcNum < y) {
                System.out.print(" #данное число меньше того, что загадал компьютер\n");
                srcNum += 1;
            }
        } 
        System.out.print(srcNum);
        System.out.print(" Вы победили!");
    }   
}