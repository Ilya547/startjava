package com.startjava.lesson_2_3_4.array;

import javafx.scene.control.Labeled;

import java.util.Arrays;

public class Task {
//    public static void main(String[] args) {
//        int[] array = new int[10];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) (Math.random() * 440 - 220);
//        }
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }
//        int max = Math.abs(array[0]);
//        for (int i = 0; i < array.length - 1; i++) {
//            if (max < Math.abs(array[i + 1])) {
//                max = Math.abs(array[i + 1]);
//            }
//        }
//        System.out.println("\nMAX = " + max);

        public static void main(String[] args) {
            int[] array = {10, 3, 53, 2, 5, 7, 3, 6, 12, 3, 32, 65}; //исходный массив
            // Сортировка пузырьком
            int temp;                                               // переменная для замены
            for (int i = array.length - 1; i > 0; i--) {            // внешний цикл
                for (int j = 0; j < i; j++) {                       // внутренний цикл
                    if (array[j] > array[j + 1]) {                  // сравнение
                        temp = array[j];                            // если истино, то меняем
                        array[j] = array[j + 1];                    // местами элементы
                        array[j + 1] = temp;
                    }
                }
            }
            // конец сортировки
            System.out.println(Arrays.toString(array));             //выводим результат на консоль

            // задаём числа в случайном порядке
            int[] numbers = new int[]{1, 23, 3, 8, 2, 4, 4};
// сортируем
            Arrays.sort(numbers);
// проверяем


        }

}
