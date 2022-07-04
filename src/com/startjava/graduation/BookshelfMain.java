package com.startjava.graduation;

import java.util.Scanner;

public class BookshelfMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Bookshelf bookshelf = new Bookshelf(10);
        int chooseAction;
        System.out.println("Актуальное состояние книжной полки: ");
        showVisualization(bookshelf);
        do {
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
                    """);
            chooseAction = scan.nextInt();
            scan.nextLine();
            switch (chooseAction) {
                case 1 -> {
                    System.out.print("Введите номер книги для удаления: ");
                    bookshelf.deleteBook(scan.nextInt());
                }
                case 2 -> {
                    System.out.println("Введите номер книги для перемещения: ");
                    int positionOrigin = scan.nextInt();
                    System.out.println("Введите новое место для книги: ");
                    int positionDestination = scan.nextInt();
                    bookshelf.changeBookPosition(positionOrigin, positionDestination);
                }
                case 3 -> {
                    System.out.println("\nВведите автора, название и год выпуска книги(используйте Enter в качестве" +
                            " разделителя):");
                    Book newBook = new Book(scan.nextLine(), scan.nextLine(), scan.nextLine());
                    if (!bookshelf.addBook(newBook)) {
                        System.err.println("Книга не добавлена.");
                    }
                }
                case 4 -> {
                    System.out.println("Введите название книги, для ее поиска:");
                    String title = scan.nextLine();
                    try {
                        int i = bookshelf.findBook(title);
                        System.out.print(bookshelf.getBooks()[i] + "\n");
                    } catch (NumberFormatException e) {
                        System.err.println("Книга не найдена");
                    }
                }
                case 5 -> {
                    System.out.println("Количество книг на полке: " +
                            bookshelf.getCountBooks());
                }
                case 6 -> System.out.println("Количество свободного места: " + bookshelf.getCountFreeSpace());
                case 7 -> System.out.println("Работа программы завершена.");
            }
            System.out.println("Актуальное состояние книжной полки: ");
            showVisualization(bookshelf);
        } while (chooseAction != 7);
    }

    private static void showVisualization(Bookshelf bookshelf) {
        for (int i = 0; i < bookshelf.getBooks().length; i++) {
            System.out.print("<" + (i + 1) + " ");
            System.out.print(bookshelf.getBooks()[i]);
        }
    }
}