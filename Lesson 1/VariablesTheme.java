public class VariablesTheme {
    public static void main(String[] args) {
        //1.Создание переменных и вывод их значений на консоль
        String title1 = "1.Создание переменных и вывод их значений на консоль;";
        byte numCores = 2; 
        short ramMb = 4096;
        int hddGb = 931;
        long freqCpuGhz = 2;
        float cpuFsbMhz = 99.8f;
        double cpuPackagePowerW = 3.60d;
        boolean thisPc = true;
        char NamePc = '1';
        System.out.println(title1);
        System.out.println("numCores = " + numCores + "; ramMb = " + ramMb + "; hddGb = " + hddGb + "; freqCpuGhz = " + freqCpuGhz + "; cpuFsbMhz = " + cpuFsbMhz + "; cpuPackagePowerW = " + cpuPackagePowerW + "; thisPc = " + thisPc + "; NamePc = " + NamePc);

        //2.Расчет стоимости товара со скидкой
        String title2 = "2.Расчет стоимости товара со скидкой";
        byte x = 100;
        short y = 200;
        float discount = 0.11f;
        String text1 = "Итоговая сумма товаров со скидкой :";
        String text2 = "Размер скидки :";
        System.out.println(title2);
        System.out.println(text1);
        System.out.println(x + y - (x + y) * discount);
        System.out.println(text2);
        System.out.println((x + y) * discount);

        //3.Вывод на консоль слова JAVA
        String title3 = "3.Вывод на консоль слова JAVA";
        String line1 = "   J    a  v     v  a ";
        String line2 = "   J   a a  v   v  a a  ";
        String line3 = "J  J  aaaaa  V V  aaaaa ";
        String line4 = "JJ  a     a  V  a     a";
        System.out.println(title3);
        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        System.out.println(line4);

        //4.Отображение min и max значений числовых типов данных
        String title4 = "4.Отображение min и max значений числовых типов данных";
        String subtitle1 = "Инкрементируемые значения:";
        String subtitle2 = "Декрементируемые значения:";
        byte bMax = Byte.MAX_VALUE;
        short sMax = Short.MAX_VALUE;
        int iMax = Integer.MAX_VALUE;
        long lMax = Long.MAX_VALUE;
        float fMax = Float.MAX_VALUE;
        double dMax = Double.MAX_VALUE;
        System.out.println(title4);
        System.out.println("bMax = " + bMax + "; sMax = " + sMax + "; iMax = " + iMax + "; lMax = " + lMax + "; fMax = " + fMax + "; dMax = " + dMax);
        System.out.println(subtitle1);
        System.out.println("bMax = " + (bMax + 1) + "; sMax = " + (sMax + 1) + "; iMax = " + (iMax + 1) + "; lMax = " + (lMax + 1) + "; fMax = " + (fMax + 1) + "; dMax = " + (dMax + 1));
        System.out.println(subtitle2);
        System.out.println("bMax = " + (bMax - 1) + "; sMax = " + (sMax - 1) + "; iMax = " + (iMax - 1) + "; lMax = " + (lMax - 1) + "; fMax = " + (fMax - 1) + "; dMax = " + (dMax - 1));

        //5.Перестановка значений переменных
        String title5 = "5.Перестановка значений переменных";
        System.out.println(title5);
        float temperature = 36.6f;
        double pi = 3.1416d;
        System.out.println("temperature = " + temperature + "; pi = " + pi + ";");
        double temp = pi;
        pi = temperature;
        temperature = (float)temp;
        System.out.printf("temperature = " + temperature + "; pi = " + "%.1f",pi);
        System.out.println(";");

        //6.Вывод символов и их кодов
        String title6 = "6.Вывод символов и их кодов";
        byte a = 35;
        byte b = 38;
        byte c = 64;
        byte d = 94;
        byte e = 95;
        char chA = (char) a; 
        char chB = (char) b;
        char chC = (char) c;
        char chD = (char) d;
        char chE = (char) e;
        System.out.println(title6);
        System.out.println(a + " = " + chA + " ; " + b + " = " + chB + " ; " + c + " = " + chC + " ; " + d + " = " + chD + " ; " + e + " = " + chE + " ; " );

        //7.Произведение и сумма цифр числа
        String title7 = "7.Произведение и сумма цифр числа";
        int num = 345;
        int n5 = num % 10;
        int nu = num / 10;
        int n4 = nu % 10;
        int n3 = nu / 10;
        System.out.println(title7);
        System.out.println("Произведение : " + n3 * n4 * n5);
        System.out.println("Сумма : " + (n3 + n4 + n5));


        //8.Вывод на консоль ASCII-арт Дюка
        String title8 ="8.Вывод на консоль ASCII-арт Дюка";
        char sp =  32;
        char fSl = 47;
        char bSl = 92;
        char lPa = 40;
        char rPa = 41;
        char und = 95;
        System.out.println(title8);
        System.out.println(sp + "" + sp + "" + sp + "" + sp + "" + fSl + "" + bSl + "" + sp + "" + sp + "" + sp + "" + sp + "" + sp + "" + sp);
        System.out.println(sp + "" + sp + "" + sp + "" + fSl + "" + sp + "" + sp + "" +bSl + "" + sp + "" + sp + "" + sp + "" + sp + "" + sp);
        System.out.println(sp + "" + sp + "" + fSl + "" + und + "" + lPa + "" + sp + "" + rPa + "" + bSl + "" + sp + "" + sp + "" + sp + "" + sp);
        System.out.println(sp + "" + fSl + "" + sp + "" + sp + "" + sp + "" + sp + "" + sp + "" + sp + "" + bSl + "" + sp + "" + sp + "" + sp);
        System.out.println(fSl + "" + und + "" + und + "" + und + "" + und + "" + fSl + "" + bSl + "" + und + "" + und + "" + bSl + "" + sp + "" + sp);

        //9.Отображение сотен, десятков, единиц числа
        String title9 = "9.Отображение сотен, десятков, единиц числа";
        int numb = 123;
        int nnn = numb % 10;
        int n33 = numb % 10;
        int n = numb / 10;
        int n2 = n % 10;
        int n1 = n / 10;
        System.out.println(title9);
        System.out.println(" сотни = " + n1 + " ; десятки = " + n2 + "; единицы числа = " + n33);

        //10.Преобразование секунд
        String title10 = "10.Преобразование секунд";
        int number = 86399;
        int q = 3600;
        int qq = 60;
        int hours = number / q;
        System.out.println(title10);
        //System.out.println(hours); //23
        int min = (number - q * hours) / qq;
        //System.out.println(min); //59
        //82800 + 3540
        int sec = (number - q * hours - qq * min);
        //System.out.println(sec); //59
        System.out.println(hours + ":" + min + ":" + sec);
                }
}