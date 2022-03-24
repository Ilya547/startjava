public class CyclesTheme {
    public static void main(String[] args) {
        //1. Подсчет суммы четных и нечетных чисел
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int sumEven = 0;
        int sumOdd = 0;
        int i = -10;
        do {
            i++;
            if(i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
        } while(i < 22);
        System.out.println("Sum even = " + sumEven);
        System.out.println("Sum odd = " + sumOdd);
        System.out.println();

        //2.Вывод чисел между max и min
        System.out.println("2.Вывод чисел между max и min");
        int maxNum = 0;
        int minNum = 0;
        int zNum = 0;
        if ((10 > 5) & (10 > -1)) {
            maxNum = 10;
        } else if ((5 > 10) & (5 > -1)) {
            maxNum = 5;
        } else {
            maxNum = -1;
        }
        if ((10 < 5) & (10 < -1)) {
            minNum = 10;
        } else if ((5 < 10) & (5 < -1)) {
            minNum = 5;
        } else {
            minNum = -1;
        }
        for(i = maxNum - 1; i > minNum; i--) {
            System.out.printf("%2d;", i);
        }
        System.out.println();
        System.out.println();

        //3.Вывод реверсивного числа и суммы его цифр
        System.out.println("3.Вывод реверсивного числа и суммы его цифр");
        int srcNum = 1234; 
        int digit;
        int sumDigit = 0;
        while(srcNum > 0) {
            digit = srcNum % 10;
            srcNum /= 10;
            System.out.print(digit);
            sumDigit += digit;
        }
        System.out.println("Sum numbers = " + sumDigit + "\n");
        
        //4.Вывод чисел на консоль в несколько строк
        System.out.println("4.Вывод чисел на консоль в несколько строк");
        int counter = 0;
        for(i = 1; i < 24; i += 2) {
            counter++;
                if (counter % 5 == 0) {
                    System.out.printf("%3d%n", i);
                } else if (i == 23) {
                    for (i = 23; counter < 16; counter++) {
                        System.out.printf("%3d", 0);
                    }
                } else {
                    System.out.printf("%3d", i);
                }
        }
        System.out.println();
        System.out.println();

        //5.Проверка количества единиц на четность
        System.out.println("5.Проверка количества единиц на четность");
        srcNum = 3141591;
        int sumOne = 0;
        while(srcNum  > 0) {
            digit = srcNum % 10;
            srcNum /= 10;
            if (digit == 1) {
                sumOne = sumOne + digit;
                System.out.printf("%d; ", digit);
            }
        }
        System.out.println();
        if (sumOne % 2 ==0) {
            System.out.println("Сумма единиц - четное число");
        } else {
            System.out.println("Сумма единиц - нечетное число");
        }
        System.out.println();

        //6.Отображение фигур в консоли
        System.out.println("6. Отображение фигур в консоли");
        int j = 0;
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 10; j++) {
                System.out.print("*");
            }
        System.out.println();
        }
        System.out.println();
        int condition = 4;
        i = 0;
        j = 0;
        while (i < 5) {
            System.out.print("#");
            while (j < condition) {
                j++;
                System.out.print("#");
            }
            i++;
            j = j - condition;
            condition--;
        System.out.println();
        }
        System.out.println();
        condition = 1;
        i = 0;
        j = 0;
        do {
            do {
                System.out.print("$");
                j++;
            } while (j < condition);
            i++;
            j = j - condition;
            condition++;
            System.out.println();
        } while (i < 2);
        condition = 3;
        i = 0;
        j = 0;
        do {
            do {
                System.out.print("$");
                j++;
            } while (j < condition);
            i++;
            j = j - condition;
            condition--;
            System.out.println();
        } while (i < 3);
        System.out.println();

        //7.Отображение ASCII-символов
        System.out.println("7.Отображение ASCII-символов");
        System.out.println(" Dec  Char");
        for (i = 0; i < 256; i++) {
            System.out.printf("%4d%4c", i, (char) i);
            System.out.println();
        }
        System.out.println();

        //10.Вывод таблицы умножения Пифагора
        System.out.println("10.Вывод таблицы умножения Пифагора");
        for (i = 1; i < 10; i++) {
            if (i ==1) {
                System.out.printf("%3s", " ");;
            } else {
                System.out.printf("%3d", i);
            }
        }
        System.out.println();
        for (i = 2; i < 10; i++) {
            for (j = 1; j < 10; j++) {
                System.out.printf("%3d", i * j);
            }
        System.out.println();
        j = 1;
        }
    }   
}