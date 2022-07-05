package com.startjava.graduation;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BookshelfMain {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Bookshelf bookshelf = new Bookshelf(10);
        int chooseAction = 0;
        do {
//            chooseAction = 0;
            System.out.println("Актуальное состояние книжной полки: ");
            showVisualization(bookshelf);
            System.out.println("""
                    \nВыберите действие с помощью чисел. 
                    Пример: если вы хотите удалить книгу - введите 1 и нажмите Enter.
                    1.Удалить книгу
                    2.Переместить книгу
                    3.Добавить книгу
                    4.Искать книгу по названию
                    5.Вывести число всех книг
                    6.Показать количество свободного места
                    7.Выйти из программы
                    Введите номер команды: 
                    \n""");
            try {
                chooseAction = scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Ошибка!Введите натуральное число, которое соответствует строчке в меню.");
            }
            scan.nextLine();
            switch (chooseAction) {
                case 1 -> {
                    System.out.print("Введите номер книги для удаления: ");
                    try {
                        int number = scan.nextInt();
                        bookshelf.deleteBook(number);

                    } catch (InputMismatchException e) {
                        scan.nextLine();
                        System.out.println("Ошибка!Введите натуральное число.");
                    }
                }
                case 2 -> {
                    System.out.println("Введите номер книги для перемещения: ");
                    int positionOrigin = scan.nextInt();
                    if (positionOrigin > 0 && positionOrigin <= bookshelf.getBooks().length) {
                        System.out.println("Введите новое место для книги: ");
                        int positionDestination = scan.nextInt();
                        if (positionDestination > 0 && positionDestination <= bookshelf.getBooks().length) {
                            try {
                                bookshelf.changeBookPosition(positionOrigin, positionDestination);
                            } catch (InputMismatchException e) {
                                System.out.println("Ошибка!Введите целые числа.");
                            }
                        } else {
                            System.out.println("Ошибка!Введите число от 1 до " + bookshelf.getBooks().length
                                    + " включительно.");
                        }

                    } else {
                        System.out.println("Ошибка!Введите число от 1 до " + bookshelf.getBooks().length
                                + " включительно.");
                    }

                }
                case 3 -> {
                    System.out.println("\nВведите автора, название и год выпуска книги(используйте Enter в качестве" +
                            " разделителя):");
                    Book newBook = new Book(scan.nextLine(), scan.nextLine(), scan.nextLine());
                    try {
                        if (!bookshelf.addBook(newBook)) {
                            System.out.println("Книга не добавлена.");
                        }

                    } catch (InputMismatchException e) {
                        System.out.println("Ошибка!Введите натуральное число.");
                    }

                }
                case 4 -> {
                    System.out.println("Введите название книги, для ее поиска:");
                    try {
                        String title = scan.nextLine();
                        int i = bookshelf.findBook(title);
                        System.out.print(bookshelf.getBooks()[i] + "\n");
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("Книга не найдена.");
                    }
                }
                case 5 -> {
                    System.out.println("Количество книг на полке: " +
                            bookshelf.getCountBooks());
                }
                case 6 -> System.out.println("Количество свободного места: " + bookshelf.getCountFreeSpace());
                case 7 -> System.out.println("Работа программы завершена.");
                default -> System.out.println("Ошибка.Вы ввели некорректное число!");
            }
        } while (chooseAction != 7);
    }

    private static void showVisualization(Bookshelf bookshelf) {
        for (int i = 0; i < bookshelf.getBooks().length; i++) {
            System.out.print("<" + (i + 1) + " ");
            System.out.print(bookshelf.getBooks()[i]);
        }
    }
}