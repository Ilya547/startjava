public class VariablesTheme {
    public static void main(String[] args) {
        //1.Создание переменных и вывод их значений на консоль
        byte numCores = 2; 
        short ramMb = 4096;
        int hddGb = 931;
        long freqCpuGhz = 2;
        float cpuFsbMhz = 99.8f;
        double cpuPackagePowerW = 3.60d;
        boolean thispacec = true;
        char namePc = '1';
        System.out.println("1.Создание переменных и вывод их значений на консоль");
        System.out.println("numCores = " + numCores + "; ramMb = " + ramMb + "; hddGb = " + hddGb + "; freqCpuGhz = " + freqCpuGhz + "; cpuFsbMhz = " + cpuFsbMhz + "; cpuPackagePowerW = " + cpuPackagePowerW + "; thispacec = " + thispacec + ";+ namePc = " + namePc);

        //2.Расчет стоимости товара со скидкой
        byte priceX = 100;
        short priceY = 200;
        float discount = 0.11f;
        short totalSum = 300;
        System.out.println("2.Расчет стоимости товара со скидкой");
        System.out.println("Итоговая сумма товаров со скидкой :" + (totalSum - totalSum * discount));
        System.out.println("Размер скидки :" + totalSum * discount);

        //3.Вывод на консоль слова JAVA
        System.out.println("3.Вывод на консоль слова JAVA");
        System.out.println("   J    a  v     v  a ");
        System.out.println("   J   a a  v   v  a a  ");
        System.out.println("J  J  aaaaa  V V  aaaaa ");
        System.out.println(" JJ  a     a  V  a     a");

        //4.Отображение min и max значений числовых типов данных
        byte bMax = Byte.MAX_VALUE;
        short sMax = Short.MAX_VALUE;
        int intMax = Integer.MAX_VALUE;
        long lMax = Long.MAX_VALUE;
        float fMax = Float.MAX_VALUE;
        double dMax = Double.MAX_VALUE;
        System.out.println("4.Отображение min и max значений числовых типов данных");
        System.out.println("Отображение max значений числовых типов данных:");
        System.out.println("bMax = " + bMax + "; sMax = " + sMax + "; iMax = " + intMax + "; lMax = " + lMax + "; fMax = " + fMax + "; dMax = " + dMax);
        ++bMax;
        ++sMax;
        ++intMax;
        ++ lMax;
        ++fMax;
        ++dMax;
        System.out.println("Инкрементируемые значения:\n"+"bMax = " + bMax + "; sMax = " + sMax + "; iMax = " + intMax + "; lMax = " + lMax + "; fMax = " + fMax + "; dMax = " + dMax);
        --bMax;
        --sMax;
        --intMax;
        --lMax;
        --fMax;
        --dMax;
        System.out.println("Декрементируемые значения:\n"+ "bMax = " + bMax + "; sMax = " + sMax + "; iMax = " + intMax + "; lMax = " + lMax + "; fMax = " + fMax + "; dMax = " + dMax);

        //5.Перестановка значений переменных
        System.out.println("5.Перестановка значений переменных");
        float number1 = 36.6f;
        double number2 = 3.1416d;
        System.out.println("number1 = " + number1 + "; number2 = " + number2 + ";");
        double tempNumber = number2;
        number2 = number1;
        number1 = (float) tempNumber;
        System.out.printf("number1 = " + number1 + "; number2 = " + "%.1f",number2);
        System.out.println(";");

        //6.Вывод символов и их кодов
        byte hash = 35;
        byte ampersand = 38;
        byte at = 64;
        byte caret = 94;
        byte underscore = 95;
        char chHash = (char) hash; 
        char chAmpersand = (char) ampersand;
        char chAt = (char) at;
        char chCaret = (char) caret;
        char chUnderscore = (char) underscore;
        System.out.println("6.Вывод символов и их кодов");
        System.out.println(hash + " = " + chHash + " ; " + ampersand + " = " + chAmpersand + " ; " + at + " = " + chAt + " ; " + caret + " = " + chCaret + " ; " + underscore + " = " + chUnderscore + " ; " );

        //7.Произведение и сумма цифр числа
        int srcNum = 345;
        int digit = srcNum % 10;
        int tmpNum = srcNum / 10;
        int tens = tmpNum % 10;
        int hundreds = tmpNum / 10;
        System.out.println("7.Произведение и сумма цифр числа");
        System.out.println("Произведение : " + hundreds * tens * digit);
        System.out.println("Сумма : " + (hundreds + tens + digit));

        //8.Вывод на консоль ASCII-арт Дюка
        char space = ' ';
        char forwardSlash = '/';
        char backslash = '\\';
        char leftBracket = '(';
        char rightBracket = ')';
        System.out.println("8.Вывод на консоль ASCII-арт Дюка");
        System.out.println(space + "" + space + "" + space + "" + space + "" + forwardSlash + "" + backslash + "" + space + "" + space + "" + space + "" + space + "" + space + "" + space);
        System.out.println(space + "" + space + "" + space + "" + forwardSlash + "" + space + "" + space + "" +backslash + "" + space + "" + space + "" + space + "" + space + "" + space);
        System.out.println(space + "" + space + "" + forwardSlash + "" + chUnderscore + "" + leftBracket + "" + space + "" + rightBracket + "" + backslash + "" + space + "" + space + "" + space + "" + space);
        System.out.println(space + "" + forwardSlash + "" + space + "" + space + "" + space + "" + space + "" + space + "" + space + "" + backslash + "" + space + "" + space + "" + space);
        System.out.println(forwardSlash + "" + chUnderscore + "" + chUnderscore + "" + chUnderscore + "" + chUnderscore + "" + forwardSlash + "" + backslash + "" + chUnderscore + "" + chUnderscore + "" + backslash + "" + space + "" + space);

        //9.Отображение сотен, десятков, единиц числа
        int srcNumb = 123;
        int tmpNumb2 = srcNumb % 10;
        digit = srcNumb % 10;
        tmpNum = srcNumb / 10;  
        tens = tmpNum % 10;
        hundreds = tmpNum / 10;
        System.out.println("9.Отображение сотен, десятков, единиц числа");
        System.out.println(" сотни = " + hundreds + " ; десятки = " + tens + "; единицы числа = " + digit);

        //10.Преобразование секунд
        int numberSec = 86399;
        int secPerHour = 3600;
        int secPerMinute = 60;
        int hours = numberSec / secPerHour;
        System.out.println("10.Преобразование секунд");
        int min = (numberSec - secPerHour * hours) / secPerMinute;
        int sec = (numberSec - secPerHour * hours - secPerMinute * min);
        System.out.println(hours + ":" + min + ":" + sec);
            }
}