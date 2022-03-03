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
        byte productX = 100;
        short productY = 200;
        float discount = 0.11f;
        short sumXY = 300;
        System.out.println("2.Расчет стоимости товара со скидкой");
        System.out.println("Итоговая сумма товаров со скидкой :");
        System.out.println(sumXY - sumXY * discount);
        System.out.println("Размер скидки :");
        System.out.println(sumXY * discount);

        //3.Вывод на консоль слова JAVA
        System.out.println("3.Вывод на консоль слова JAVA");
        System.out.println("   J    a  v     v  a ");
        System.out.println("   J   a a  v   v  a a  ");
        System.out.println("J  J  aaaaa  V V  aaaaa ");
        System.out.println(" JJ  a     a  V  a     a");

        //4.Отображение min и max значений числовых типов данных
        byte bMax = Byte.MAX_VALUE;
        byte bMin = Byte.MIN_VALUE;
        short sMax = Short.MAX_VALUE;
        short sMin = Short.MIN_VALUE;
        int intMax = Integer.MAX_VALUE;
        int intMin = Integer.MIN_VALUE;
        long lMax = Long.MAX_VALUE;
        Long lMin = Long.MIN_VALUE;
        float fMax = Float.MAX_VALUE;
        float fMin = Float.MIN_VALUE;
        double dMax = Double.MAX_VALUE;
        double dMin = Double.MIN_VALUE;
        System.out.println("4.Отображение min и max значений числовых типов данных");
        System.out.println("Отображение max значений числовых типов данных:");
        System.out.println("bMax = " + bMax + "; sMax = " + sMax + "; iMax = " + intMax + "; lMax = " + lMax + "; fMax = " + fMax + "; dMax = " + dMax);
        System.out.println("Отображение min значений числовых типов данных:");
        System.out.println("bMin = " + bMin + "; sMin = " + sMin + "; iMin = " + intMin + "; lMin = " + lMin + "; fMin = " + fMin + "; dMin = " + dMin);
        System.out.println("Инкрементируемые значения for max:");
        System.out.println("bMax = " + (bMax + 1) + "; sMax = " + (sMax + 1) + "; iMax = " + (intMax + 1) + "; lMax = " + (lMax + 1) + "; fMax = " + (fMax + 1) + "; dMax = " + (dMax + 1));
        System.out.println("Декрементируемые значения for max:");
        System.out.println("bMax = " + (bMax - 1) + "; sMax = " + (sMax - 1) + "; iMax = " + (intMax - 1) + "; lMax = " + (lMax - 1) + "; fMax = " + (fMax - 1) + "; dMax = " + (dMax - 1));
        System.out.println("Инкрементируемые значения for min:");
        System.out.println("bMin = " + (bMin + 1) + "; sMin = " + (sMin + 1) + "; iMin = " + (intMin + 1) + "; lMin = " + (lMin + 1) + "; fMin = " + (fMin + 1) + "; dMin = " + (dMin + 1));
        System.out.println("Декрементируемые значения for min:");
        System.out.println("bMin = " + (bMin - 1) + "; sMin = " + (sMin - 1) + "; iMin = " + (intMin - 1) + "; lMin = " + (lMin - 1) + "; fMin = " + (fMin - 1) + "; dMin = " + (dMin - 1));

        //5.Перестановка значений переменных
        System.out.println("5.Перестановка значений переменных");
        float temperature = 36.6f;
        double pi = 3.1416d;
        System.out.println("temperature = " + temperature + "; pi = " + pi + ";");
        double temp = pi;
        pi = temperature;
        temperature = (float)temp;
        System.out.printf("temperature = " + temperature + "; pi = " + "%.1f",pi);
        System.out.println(";");

        //6.Вывод символов и их кодов
        byte hash = 35;
        byte ampersand = 38;
        byte at = 64;
        byte caret = 94;
        byte underscoreerscore = 95;
        char chHash = (char) hash; 
        char chAmpersand = (char) ampersand;
        char chAt = (char) at;
        char chCaret = (char) caret;
        char chunderscoreerscore = (char) underscoreerscore;
        System.out.println("6.Вывод символов и их кодов");
        System.out.println(hash + " = " + chHash + " ; " + ampersand + " = " + chAmpersand + " ; " + at + " = " + chAt + " ; " + caret + " = " + chCaret + " ; " + underscoreerscore + " = " + chunderscoreerscore + " ; " );

        //7.Произведение и сумма цифр числа
        int num = 345;
        int digit = num % 10;
        int interim = num / 10;
        int ty = interim % 10;
        int hundreds = interim / 10;
        System.out.println("7.Произведение и сумма цифр числа");
        System.out.println("Произведение : " + hundreds * ty * digit);
        System.out.println("Сумма : " + (hundreds + ty + digit));

        //8.Вывод на консоль ASCII-арт Дюка
        char space = ' ';
        char forwardSlash = '/';
        char backslash = 92;
        char leftParentheses = '(';
        char rightParentheses = ')';
        char underscore = '_';
        System.out.println("8.Вывод на консоль ASCII-арт Дюка");
        System.out.println(space + "" + space + "" + space + "" + space + "" + forwardSlash + "" + backslash + "" + space + "" + space + "" + space + "" + space + "" + space + "" + space);
        System.out.println(space + "" + space + "" + space + "" + forwardSlash + "" + space + "" + space + "" +backslash + "" + space + "" + space + "" + space + "" + space + "" + space);
        System.out.println(space + "" + space + "" + forwardSlash + "" + underscore + "" + leftParentheses + "" + space + "" + rightParentheses + "" + backslash + "" + space + "" + space + "" + space + "" + space);
        System.out.println(space + "" + forwardSlash + "" + space + "" + space + "" + space + "" + space + "" + space + "" + space + "" + backslash + "" + space + "" + space + "" + space);
        System.out.println(forwardSlash + "" + underscore + "" + underscore + "" + underscore + "" + underscore + "" + forwardSlash + "" + backslash + "" + underscore + "" + underscore + "" + backslash + "" + space + "" + space);

        //9.Отображение сотен, десятков, единиц числа
        int numb = 123;
        int interim1 = numb % 10;
        int digit3 = numb % 10;
        int interim2 = numb / 10;
        int ty2 = interim2 % 10;
        int hundreds1 = interim2 / 10;
        System.out.println("9.Отображение сотен, десятков, единиц числа");
        System.out.println(" сотни = " + hundreds1 + " ; десятки = " + ty2 + "; единицы числа = " + digit3);

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