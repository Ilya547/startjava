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
        System.out.println("Sum odd = " + sumOdd + "\n");

        //2.Вывод чисел между max и min
        System.out.println("2.Вывод чисел между max и min");
        int array[] = {-1, 5, 10};
        int maxNum = array[0];
        int minNum = array[0];
        for (i = 0; i < array.length;i++) {
            if (array[i] < minNum) {
                minNum = array[i];
            }
            if (array[i] > maxNum) {
                maxNum = array[i];
            }
        }
        for(i = maxNum - 1; i > minNum; i--) {
            System.out.printf("%2d;", i);
        }
        System.out.println("\n");

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
        System.out.println("\nSum numbers = " + sumDigit + "\n");
        
        //4.Вывод чисел на консоль в несколько строк
        System.out.println("4.Вывод чисел на консоль в несколько строк");
        int counter = 0;
        for(i = 1; i < 24; i += 2) {
            counter++;
            if (counter % 5 == 0) {
                System.out.printf("%3d%n", i);
                counter = 0;
            } else {
                System.out.printf("%3d", i);
            }
        }
        for (; counter <= 5; counter++) {
            if (counter == 5) {
                break;
            }
            System.out.printf("%3d", 0);
        }
        System.out.println("\n");

        //5.Проверка количества единиц на четность
        System.out.println("5.Проверка количества единиц на четность");
        srcNum = 3141591;
        int sumOne = 0;
        while(srcNum  > 0) {
            digit = srcNum % 10;
            srcNum /= 10;
            if (digit == 1) {
                sumOne += digit;
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
            j -= condition;
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
            j -= condition;
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
            j -= condition;
            condition--;
            System.out.println();
        } while (i < 3);
        System.out.println();

        //7.Отображение ASCII-символов
        System.out.println("7.Отображение ASCII-символов");
        System.out.println(" Dec  Char");
        for (i = 0; i < 256; i++) {
            System.out.printf("%4d%4c%n", i, (char) i);
        }
        System.out.println();

        //8.Проверка, является ли число палиндромом
        System.out.println("8.Проверка, является ли число палиндромом");
        srcNum = 12321;
        sumDigit = 0;
        digit = 0;
        while(srcNum > 0) {
            digit = srcNum % 10;
            if (srcNum < 10) {
                digit = srcNum;
                sumDigit += digit;
                srcNum = 12321;
                break;
            }
            sumDigit = (sumDigit + digit) * 10;
            srcNum /= 10;
        }
        if (sumDigit == srcNum) {
            System.out.println(srcNum + " - является палиндромом\n");
        } else {
            System.out.println(srcNum + " - не является палиндромом\n");
        }

        //9.Определение, является ли число счастливым
        System.out.println("9. Определение, является ли число счастливым");
        srcNum = 123456;
        digit = 0;
        sumDigit = 0;
        int sumDigit2 = 0;
        for (i = 0; i < 6; i++) {
            digit = srcNum % 10;
            if ((i == 2) || (i == 5)) {
                System.out.printf("%d = ", digit);
                System.out.printf("%d%n", sumDigit);
            } else {
                System.out.printf("%d + ", digit);
            }
            sumDigit += digit;
            srcNum /= 10;
        }
        if (sumDigit == sumDigit2) {
            System.out.println("Число является счастливым\n");
        } else {
            System.out.println("Число не является счастливым\n");
        }

        //10.Вывод таблицы умножения Пифагора
        System.out.println("10.Вывод таблицы умножения Пифагора");
        for (i = 1; i < 10; i++) {
            if (i == 1) {
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