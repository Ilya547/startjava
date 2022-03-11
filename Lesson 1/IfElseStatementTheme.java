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
            System.out.println(num1 + " является положительным числом" + "\n" + num1 + " не является числом 0");
        } else {
            System.out.println(num1 + " является отрицательным числом" + "\n" + num1 + " не является числом 0");
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
        System.out.println(symbol);
        if (Character.isDigit(symbol) == true) {
            System.out.println("Это код числа");
        } else {
            System.out.println("Это код буквы или другого символа");
        }

        //6.Определение суммы вклада и начисленных банком %
        System.out.println("6.Определение суммы вклада и начисленных банком %");
        int sumDeposit= 300000;
        int criteriaSumDeposit = 100000;
        int criteriaSumDeposit1 = 300000;
        byte percentDeposit5 = 5;
        byte percentDeposit7 = 7;
        byte percentDeposit10 = 10;
        byte divider = 100;
        if (sumDeposit < criteriaSumDeposit) {
            System.out.println("Сумма вклада : " + sumDeposit + "; начисленный процент : " + percentDeposit5 + " % ; " + "итоговая сумма с процентом : " + (sumDeposit + sumDeposit * percentDeposit5 / divider));
        }
        if (sumDeposit >= criteriaSumDeposit && sumDeposit <= criteriaSumDeposit1) {
            System.out.println("Сумма вклада : " + sumDeposit + "; начисленный процент : " + percentDeposit7 + " % ; " + "итоговая сумма с процентом : " + (sumDeposit + sumDeposit * percentDeposit7 / divider));
        }
        if (sumDeposit > criteriaSumDeposit1) {
            System.out.println("Сумма вклада : " + sumDeposit + "; начисленный процент : " + percentDeposit10 + " % ; " + "итоговая сумма с процентом : " + (sumDeposit + sumDeposit * percentDeposit10 / divider));
        }

        // 7. Определение оценки по предметам
        byte percentHistory = 59; 
        byte percentProgramming = 91;
        byte quantityDisciplines = 2;
        byte criteriaEstimation = 60;
        byte criteriaEstimation1 = 73;
        byte criteriaEstimation2 = 91;
        System.out.println("7. Определение оценки по предметам");
        if (percentHistory <= criteriaEstimation) {
            System.out.println("оценка \"2\", предмет \"история\"; ");
        } else if (percentHistory > criteriaEstimation && percentHistory <= criteriaEstimation1) {
            System.out.println("оценка \"3\", предмет \"история\"; ");
        } else if (percentHistory > criteriaSumDeposit1 && percentHistory <= criteriaEstimation2) {
            System.out.println("оценка \"4\", предмет \"история\"; ");
        } else {
            System.out.println("оценка \"5\", предмет \"история\"; ");
        }
        if (percentProgramming <= criteriaEstimation) {
            System.out.println("оценка \"2\", предмет \"программирование\"; ");
        } else if (percentProgramming > criteriaEstimation && percentProgramming <= criteriaEstimation1) {
            System.out.println("оценка \"3\", предмет \"программирование\"; ");
        } else if (percentProgramming > criteriaSumDeposit1 && percentProgramming <= criteriaEstimation2) {
            System.out.println("оценка \"4\", предмет \"программирование\"; ");
        } else {
            System.out.println("оценка \"5\", предмет \"программирование\"; ");
        }
        byte estimationHistory = 2;
        byte estimationProgramming =5;
        System.out.println("Средний балл оценок по предметам :" + ((estimationProgramming + estimationHistory) / quantityDisciplines));
        System.out.println("Cредний % по предметам : " + ((percentHistory + percentProgramming) / quantityDisciplines)); 

        //8.Расчет прибыли (убытка)
        System.out.println("8.Расчет прибыли (убытка)");
        int rentaPerMonth = 5000;
        int costPricePerMonth = 9000;
        int revenuePerMonth = 15000;
        int profitPerYear = (revenuePerMonth - rentaPerMonth - costPricePerMonth) * 12;
        if (profitPerYear <= 0) {
            System.out.println("Убыток продавца сотсавил : - " + profitPerYear);
        } else {
            System.out.println("Пpибыль продавца сотсавила : + " + profitPerYear);
        }

        //9.Определение существования треугольника
        System.out.println("9.Определение существования треугольника");
        int sideTriangleA = 9;
        int sideTriangleB = 5;
        int sideTriangleC = sideTriangleB;
        if (sideTriangleA > sideTriangleB) {
            System.out.println("Сторона треугольника, размером " + sideTriangleA + " является гипотенузой");
        } else {
            System.out.println("Сторона треугольника, размером " + sideTriangleB + " является гипотенузой");
        }
        int squareHypotenuse = sideTriangleA * sideTriangleA;
        int squareKatet = sideTriangleB * sideTriangleB;
        int sumSquareKatet = squareKatet + squareKatet;
        if (squareHypotenuse == sumSquareKatet) {
            System.out.println("Tреугольник с такими длинами сторон может существовать");
        } else {
            System.out.println("Tреугольник с такими длинами сторон не может существовать");
        }

        //10.Подсчет количества банкнот
        System.out.println("10.Подсчет количества банкнот");
        int sum = 567;
        int banknote50 = 50;
        int banknote10 = 10;
        int banknote1 = 1;
        int quantityBanknote50 = sum / banknote50;
        int quantityBanknote10 = quantityBanknote50 / banknote10;
        int quantityBanknote1 = quantityBanknote10 / banknote1;
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