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
        } while(i <= 20);
        System.out.println("Sum even = " + sumEven);
        System.out.println("Sum odd = " + sumOdd);
        System.out.println();

        //2.Вывод чисел между max и min
        System.out.println("2.Вывод чисел между max и min");
        int xNum = 10;
        int yNum = -1;
        int zNum = 5;
        if(xNum > zNum) {
            xNum = 10;
        } else if(zNum > xNum) {
            xNum = 5;
        } else {
            xNum = - 1;
        }
        if(xNum < zNum) {
            yNum = 10;
        } else {
            yNum = 5;
        }
        if(yNum >= yNum) {
            yNum = - 1;
        }
        for(i = yNum + 1; i < xNum; i++) {
            System.out.printf("%2d;", i);
        }
        System.out.println();
        System.out.println();


        //3.Вывод реверсивного числа и суммы его цифр
        System.out.println("3.Вывод реверсивного числа и суммы его цифр");
        int srcNum = 1234; 
        int reversed = 0;
        int digit;
        int tens;
        int hundreds;
        int thousands; 
        while(srcNum > 0) {
            digit = srcNum % 10;
            srcNum = srcNum / 10;
            reversed = reversed * 10 + digit;
            tens = srcNum % 10;
            srcNum = srcNum / 10;
            reversed = reversed * 10 + tens;
            hundreds = srcNum % 10;
            srcNum = srcNum / 10;
            reversed = reversed * 10 + hundreds;
            thousands = srcNum % 10;
            srcNum = srcNum / 10;
            reversed = reversed * 10 + thousands;
            System.out.println("Sum numbers: " + digit + tens + hundreds + thousands);
        }
        System.out.println("Reversed number: " + reversed);
        System.out.println();
        
        //4.Вывод чисел на консоль в несколько строк
        System.out.println("4.Вывод чисел на консоль в несколько строк");
        int counter = 0;
        for(i = 1; i < 24; i += 2) {
            counter++;
                if (counter % 5 == 0) {
                    System.out.printf("%3d%n", i);
                } else {
                    System.out.printf("%3d", i);
                }
        }
        System.out.printf("%s", "  0  0  0");
        System.out.println();

        //5.Проверка количества единиц на четность
        System.out.println("5.Проверка количества единиц на четность");
        srcNum = 3141591;
        int tenThousandth = 0;
        int millions = 0;
        int tensMillions = 0;
        int sumOne = 0;
        while(srcNum  > 0) {
            digit = srcNum % 10;
            srcNum = srcNum / 10;
            if (digit == 1) {
                sumOne = sumOne + digit;
                System.out.printf("%d; ", digit);
            }
            tens = srcNum % 10;
            srcNum = srcNum / 10;
            if (tens == 1) {
                sumOne = sumOne + tens;
                System.out.printf("%d; ", tens);
            }
            hundreds = srcNum % 10;
            srcNum = srcNum / 10;
            if (hundreds == 1) {
                sumOne = sumOne + hundreds;
                System.out.printf("%d; ", hundreds);
            }
            thousands = srcNum % 10;
            srcNum = srcNum / 10;
            if (thousands == 1) {
                sumOne = sumOne + thousands;
                System.out.printf("%d; ", thousands);
            }
            tenThousandth = srcNum % 10;
            srcNum = srcNum / 10;
            if (tenThousandth == 1) {
                sumOne = sumOne + tenThousandth;
                System.out.printf("%d; ", tenThousandth);
            }
            millions = srcNum % 10;
            srcNum = srcNum / 10;
            if (millions == 1) {
                sumOne = sumOne + millions;
                System.out.printf("%d; ", millions);
            }
            tensMillions = srcNum % 10;
            srcNum = srcNum / 10;
            if (tensMillions == 1) {
                sumOne = sumOne + tensMillions;
                System.out.printf("%d; ", tensMillions);
            }
        }
        System.out.println();
        if (sumOne % 2 ==0) {
            System.out.println("Сумма единиц - четное число");
        } else {
            System.out.println("Сумма единиц - нечетное число");
        }
        System.out.println();
        // сократил количество своего гигантского кода на 6 строк...можно сделать как-то еще проще?

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
        //С ромбом пока так, но кажется, что есть способ сделать легче
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
        for (i = 0; i < 2; i++) {
            System.out.printf("%4d%4c", i, (char)i);
            System.out.println();
        }
        System.out.println();

        //10.Вывод таблицы умножения Пифагора
        System.out.println("10.Вывод таблицы умножения Пифагора");
        for (i = 1; i < 10; i++) {
            for (j = 1; j < 10; j++) {
                System.out.printf("%3d", i * j);
            }
        System.out.println();
        j = 1;
        }
    }   
}