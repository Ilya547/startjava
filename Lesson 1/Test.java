public class Test {
    public static void main(String[] args) {
        //Создание переменных и вывод их значений на консоль
        String title4 = "Отображение min и max значений числовых типов данных";
        byte bMax = 125;
        short sMax = 32767;
        int iMax = 2147483647;
        long lMax = 9223372036854775807l;
        float fMax = 3.4E+38f;
        double dMax = 1.7E+308d;
        System.out.println(title4);
        System.out.println("bMax = " + bMax + "; sMax = " + sMax + "; iMax = " + iMax + "; lMax = " + lMax + "; fMax = " + fMax + "; dMax = " + dMax);
        System.out.println("bMax = " + bMax++ + "; sMax = " + sMax + "; iMax = " + iMax + "; lMax = " + lMax + "; fMax = " + fMax + "; dMax = " + dMax);
