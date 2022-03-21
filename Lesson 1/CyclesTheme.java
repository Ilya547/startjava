public class CyclesTheme {
    public static void main(String[] args) {
        //1. Подсчет суммы четных и нечетных чисел
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int sumEven = 0;
        int sumNotEven = 0;
        int i = - 10;
        do {
            i++;
            if(i % 2 == 0) {
                sumEven = sumEven + i;
            } else {
                sumNotEven = sumNotEven + i;
            }
        } while(i <= 20);
        System.out.println("Sum even = " + sumEven);
        System.out.println("Sum not even = " + sumNotEven);

        //2.Вывод чисел между max и min
        System.out.println("2.Вывод чисел между max и min");
        int maxNum = 0;
        int minNum = 0;
        if(10 > 5) {
            maxNum = 10;
        } else if(5 > 10) {
            maxNum = 5;
        } else {
            maxNum = - 1;
        }
        if(10 < 5) {
            minNum = 10;
        } else {
            minNum = 5;
        }
        if(minNum > - 1) {
            minNum = - 1;
        }
        for(i = minNum + 1; i < maxNum; i++) {
            System.out.println(i);
        }

        //3.Вывод реверсивного числа и суммы его цифр
        System.out.println("3.Вывод реверсивного числа и суммы его цифр");
        int num = 1234; 
        int reversed = 0;
        int digit = 0;
        int tens = 0;
        int hundreds = 0;
        int thousands = 0; 
        while(num != 0) {
            if(num > 1000) {
                digit = num % 10;
                reversed = reversed * 10 + digit;
                num /= 10;
            } else if((num >= 100) && (num < 1000)) {
                tens = num % 10;
                reversed = reversed * 10 + tens;
                num /= 10;
            } else if((num >= 10) && (num < 100)) {
                hundreds = num % 10;
                reversed = reversed * 10 + hundreds;
                num /= 10;
            } else {
                thousands = num % 10;
                reversed = reversed * 10 + thousands;
                num /= 10;
            }
        }
        System.out.println("Reversed number: " + reversed);
        System.out.println(digit + tens + hundreds + thousands + " - sum numbers(Макс, если ставлю текст перед суммой в консоли вижу 4321 помоги разобраться)");
        
        //4.Вывод чисел на консоль в несколько строк
        System.out.println("4.Вывод чисел на консоль в несколько строк");
        for(i = 1; i < 24; i += 2) {
            if(i % 9 == 0) {
                System.out.printf("%3d%n", i);
            } else if(i % 19 == 0) {
                System.out.printf("%3d%n", i);
            } else {
                System.out.printf("%3d", i);
            System.out.printf(i % 23 == 0 ? "  00  00  00%n" : " ");
            }
        }

        //5.Проверка количества единиц на четность
        System.out.println("5.Проверка количества единиц на четность");
        num = 3141591;
        int tenThousandth = 0;
        int millions = 0;
        int tensMillions = 0;
        int sumOne = 0;
        while(num != 0) {
            if(num > 1000000) {
                digit = num % 10;
                num /= 10;
                if (digit ==1) {
                    sumOne = sumOne + digit;
                    System.out.printf("%d; ", digit);
                }
            } else if((num >= 100000) && (num < 1000000)) {
                tens = num % 10;
                num /= 10;
                if (tens ==1) {
                    sumOne = sumOne + tens;
                    System.out.printf("%d; ", tens);
                }
            } else if((num >= 10000) && (num < 100000)) {
                hundreds = num % 10;
                num /= 10;
                if (hundreds ==1) {
                    sumOne = sumOne + hundreds;
                    System.out.printf("%d; ", hundreds);
                }
            } else if((num >= 1000) && (num < 10000)){
                thousands = num % 10;
                num /= 10;
                if (thousands ==1) {
                    sumOne = sumOne + thousands;
                    System.out.printf("%d; ", thousands);
                }
            } else if ((num >= 100) && (num < 1000)) {
                tenThousandth = num % 10;
                num /= 10;
                if (tenThousandth ==1) {
                    sumOne = sumOne + tenThousandth;
                    System.out.printf("%d; ", tenThousandth);
                }
            } else if((num >= 10) && (num < 100)) {
                millions = num % 10;
                num /= 10;
                if (millions ==1) {
                    sumOne = sumOne + millions;
                    System.out.printf("%d; ", millions);
                }
            } else {
                tensMillions = num % 10;
                num /= 10;
                if (tensMillions ==1) {
                    sumOne = sumOne + tensMillions;
                    System.out.printf("%d; ", tensMillions);
                }
            }
        }
        if(sumOne % 2 ==0) {
            System.out.println("Сумма единиц - четное число");
        } else {
            System.out.println("Сумма единиц - нечетное число");
        }

        //6.Отображение фигур в консоли
        System.out.println("6. Отображение фигур в консоли");
        int j = 0;
        for (i = 0; i < 5; i++) {
            for(j = 0; j < 10; j++) {
                System.out.print("*");
            }
        System.out.println();
        }
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
        //С ромбом пока не получилось, прошу дать подсказку

        //7.Отображение ASCII-символов
        System.out.println("7.Отображение ASCII-символов");
        System.out.println(" Dec  Char");
        for (i = 0; i < 2; i++) {
            System.out.printf("%4d%4c", i, (char)i);
            System.out.println();
        }
        //10.Вывод таблицы умножения Пифагора
        System.out.println("10.Вывод таблицы умножения Пифагора");
        i = 2;
        j = 2;
        for (i = 2; i < 10; i++) {
            for (j = 2; j < 10; j++) {
                System.out.printf("%3d", i * j);
            }
        System.out.println();
        j = 1;
        }

    }   
}