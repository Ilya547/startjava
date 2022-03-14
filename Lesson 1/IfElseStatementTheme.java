public class IfElseStatementTheme {
    public static void main(String[] args) {
        //1.Перевод псевдокода на язык Java
        System.out.println("1.Перевод псевдокода на язык Java");
        byte age = 22;
        if(age > 20) {
            System.out.println("возраст больше 20 лет");
        } else {
            System.out.println("возраст меньше 20 лет");
        } 
        boolean isMaleGender = false; 
        if(!isMaleGender) {
            System.out.println("пол не мужской");
        }
        float height = 1.81f;
        if(height < 1.80) {
            System.out.println("рост меньше 1.80");
        } else {
            System.out.println("рост больше 1.80");
        }
        char firstLetterName = "Ilya".charAt(0);
        if(firstLetterName == 'I') {
            System.out.println("превая буква имени I");
        } else if(firstLetterName == 'L') {
            System.out.println("первая буква имени L");
        } else {
            System.out.println("первая буква имени Y");
        }

        //2.Поиск максимального и минимального числа
        System.out.println("2.Поиск максимального и минимального числа");
        int num1 = 55;
        int num2 = 100;
        if(num1 > num2) {
            System.out.println("максимальное число = " + num1 + "\nминимальное число = " + num2);
        } else {
            System.out.println("максимальное число = " + num2 + "\nминимальное число = " + num1);
        }

        //3.Работа с числом
        System.out.println("3.Работа с числом");
        num1 = 1001;
        if (num1 % 2 == 0) {
            System.out.println(num1 + " является четным числом");
        } else {
            System.out.println(num1 + " является нечетным числом");
        }
        if (num1 > 0) {
            System.out.println(num1 + " является положительным числом");
        } else if (num1 == 0) {
            System.out.println(num1 + " является 0");
        } else {
            System.out.println(num1 + " является отрицательным числом");
        }

        //4.Поиск общей цифры в числах
        System.out.println("4.Поиск общей цифры в числах");
        num1 = 721;
        num2 = 921;
        int digit1 = num1 % 10;
        int tmpNum1 = num1 / 10;
        int tens1 = tmpNum1 % 10;
        int hundreds1 = tmpNum1 / 10;
        int digit2 = num2 % 10;
        int tmpNum2 = num2 / 10;
        int tens2 = tmpNum2 % 10;
        int hundreds2 = tmpNum2 / 10;
        if (digit1 == digit2) {
            System.out.println("цифра " + digit1 + " стоит в одном и том же разряде в числах :" + num1 + " и " + num2 + " ;");
        } 
        if (tens1 == tens1) {
            System.out.println("цифра " + tens1 + " стоит в одном и том же разряде в числах :" + num1 + " и " + num2 + " ;");
        }
        if (hundreds1 == hundreds2) {
            System.out.println("цифра " + hundreds1+ " стоит в одном и том же разряде в числах :" + num1 + " и " + num2 + " ;");
        }

        //5.Определение буквы или символа по их коду
        System.out.println("5.Определение буквы или символа по их коду");
        char symbol = '\u005A';
        int ascii = (int) symbol;
        if ((40 > ascii) || (ascii < 91) || (96 > ascii) || (ascii < 123) || (127 > ascii) || (ascii < 176) || (223 > ascii) || (ascii < 242)) {
            System.out.println(symbol + " является буквой");
        } else if ((47 > ascii) || (ascii < 58)) {
            System.out.println(symbol + " является числом");
        } else {
            System.out.println(symbol + " является специальным символом");
        }

        //6.Определение суммы вклада и начисленных банком %
        System.out.println("6.Определение суммы вклада и начисленных банком %");
        int sumDeposit = 300000;
        int criteriaSumDeposit = 100000;
        int criteriaSumDeposit1 = 300000;
        byte percentDeposit = 0;
        if (sumDeposit < criteriaSumDeposit) {
            percentDeposit = 5;
        } else if (sumDeposit >= criteriaSumDeposit && sumDeposit <= criteriaSumDeposit1) {
            percentDeposit = 7;
        } else {
            percentDeposit = 10;
        }
        int totalSumDeposit = sumDeposit + sumDeposit * percentDeposit / 100;
        System.out.println("Сумма вклада : " + sumDeposit);
        System.out.println("Начисленный процент : " + percentDeposit);
        System.out.println("Итоговая сумма с процентом : " + totalSumDeposit);

        // 7. Определение оценки по предметам
        byte percentHistory = 59; 
        byte percentProgramming = 91;
        byte quantityDisciplines = 2;
        byte criteriaEstimation = 60;
        byte criteriaEstimation1 = 73;
        byte criteriaEstimation2 = 91;
        byte estimationHistory = 0;
        byte estimationProgramming = 0;
        System.out.println("7. Определение оценки по предметам");
        if (percentHistory <= criteriaEstimation) {
            System.out.println((estimationHistory = 2) + " - история");
        } else if ((percentHistory > criteriaEstimation) && (percentHistory <= criteriaEstimation1)) {
            System.out.println((estimationHistory = 3) + " - история");
        } else if ((percentHistory > criteriaSumDeposit1) && (percentHistory <= criteriaEstimation2)) {
            System.out.println((estimationHistory = 4) + " - история");
        } else {
            System.out.println((estimationHistory = 5) + " - история");
        }
        if (percentProgramming <= criteriaEstimation) {
            System.out.println((estimationProgramming = 2) + " - программирование");
            estimationProgramming = 2;
        } else if ((percentProgramming > criteriaEstimation) && (percentProgramming <= criteriaEstimation1)) {
            System.out.println((estimationProgramming = 3) + " - программирование");
        } else if ((percentProgramming > criteriaSumDeposit1) && (percentProgramming <= criteriaEstimation2)) {
            System.out.println((estimationProgramming = 4) + " - программирование");
        } else {
            System.out.println((estimationProgramming = 5) + " - программирование");
        }
        System.out.println("Средний балл оценок по предметам :" + ((estimationProgramming + estimationHistory) / quantityDisciplines));
        System.out.println("Cредний % по предметам : " + ((percentHistory + percentProgramming) / quantityDisciplines)); 

        //8.Расчет прибыли (убытка)
        System.out.println("8.Расчет прибыли (убытка)");
        int rentaPerMonth = 5000;
        int costPricePerMonth = 9000;
        int revenuePerMonth = 15000;
        int profitPerYear = (revenuePerMonth - rentaPerMonth - costPricePerMonth) * 12;
        if (profitPerYear <= 0) {
            System.out.println("Убыток продавца сотсавил : " + profitPerYear);
        } else {
            System.out.println("Пpибыль продавца сотсавила : + " + profitPerYear);
        }

        //9.Определение существования треугольника
        System.out.println("9.Определение существования треугольника");
        int sideTriangleA = 3;
        int sideTriangleB = 4;
        int sideTriangleC = 5;
        if ((sideTriangleA + sideTriangleB > sideTriangleC) || (sideTriangleB + sideTriangleC > sideTriangleA) || (sideTriangleA + sideTriangleC > sideTriangleB)) {
            System.out.println("Треугольник существует");
        } else {
            System.out.println("Треугольник не существует");
        }
        if (sideTriangleA * sideTriangleA + sideTriangleB * sideTriangleB == sideTriangleC * sideTriangleC) {
            System.out.println("Сторона с размером " + sideTriangleC + " является гипотенузой, значит треугольник прямоугольный");
        } else if (sideTriangleA * sideTriangleA == sideTriangleB * sideTriangleB + sideTriangleC * sideTriangleC) {
            System.out.println("Сторона с размером " + sideTriangleA + " является гипотенузой, значит треугольник прямоугольный");
        } else {
            System.out.println("Сторона с размером " + sideTriangleB + " является гипотенузой, значит треугольник прямоугольный");
        }
        int triangleArea = sideTriangleA * sideTriangleB / 2;
        System.out.println("Площадь теугольника = " + triangleArea);
        System.out.println(" |\\" + "\nB| \\ C" + "\n |  \\" + "\n |___\\" + "\n   A    ");


        //10.Подсчет количества банкнот
        System.out.println("10.Подсчет количества банкнот");
        int sum = 567;
        int banknote50 = 50;
        int banknote10 = 10;
        int banknote1 = 1;
        int quantityBanknote50 = sum / banknote50;
        int quantityBanknote10 = (sum - quantityBanknote50 * banknote50) / banknote10;
        int quantityBanknote1 = sum - quantityBanknote10 * banknote10 - quantityBanknote50 * banknote50;
        int remainderDivisionSumBanknote50 = sum % banknote50;
        int remainderDivisionSumBanknote10 = remainderDivisionSumBanknote50 % banknote10;
        int remainderDivisionSumBanknote1 = remainderDivisionSumBanknote10 % banknote1;
        System.out.println("Исходная сумма : " + sum);
        if (remainderDivisionSumBanknote50 > 0) {
             System.out.println("Потребуется " + quantityBanknote50 + " купюр номиналом 50, ниже указаны номиналы купюр, которые потребуются дополнительно.");
        } else {
            System.out.println("Потребуется" + quantityBanknote50 + " купюр номиналом 50");
        }
        if (remainderDivisionSumBanknote10 > 0) {
            System.out.println("Дополнительно потребуется " + quantityBanknote10 + " купюра(ы) номиналом 10, ниже указаны номиналы купюр, которые потребуются дополнительно");
        } else {
            System.out.println("Дополнительно потребуется " + quantityBanknote10 + " купюра(ы) номиналом 10");
        }
        if (remainderDivisionSumBanknote1 > 0) {
            System.out.println("Также потребуется " + quantityBanknote1 + " купюр номиналом 1. Остаток на счете < 1");
        } else {
            System.out.println("Также потребуется " + quantityBanknote1 + " купюра(ы) номиналом 1. Остаток на счете 0.");
        }
    }
}