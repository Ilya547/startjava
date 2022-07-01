package com.startjava.graduation;

import java.util.Scanner;

public class BookshelfMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Bookshelf bookshelf = new Bookshelf(10);
        String reply = "enter";
        do {
            System.out.println("""
                    \nВыберите действие с помощью чисел. 
                    Пример : если вы хотите удалить книгу - введите 1 и нажмите Enter.
                    1.Удалить книгу
                    2.Переместить книгу
                    3.Добавить книгу
                    4.Искать книгу по названию
                    5.Вывести число всех книг
                    6.Показать количество свободного места
                    7.Выйти из программы
                    Введите номер команды: 
                    """);
            int chooseAction = scan.nextInt();
            switch (chooseAction) {
                case 1 -> {
                    System.out.println("Введите номер книги для удаления : ");
                    bookshelf.deleteBook(scan.nextInt());
                }
                case 2 -> {
                    System.out.println("Введите номер книги для перемещения : ");
                    int positionOrigin = scan.nextInt() - 1;
                    System.out.println("Введите новое место для книги : ");
                    int positionDestination = scan.nextInt() - 1;
                    bookshelf.changeBookPosition(positionOrigin, positionDestination);
                }
                case 3 -> {
                    System.out.println("\nВведите автора, название и год выпуска книги(используйте Enter в качестве" +
                            " разделителя) :");
                    scan.nextLine();
                    Book newBook = new Book(scan.nextLine(), scan.nextLine(), scan.nextLine());
                    if (!bookshelf.addBook(newBook)) {
                        System.err.println("Книга не добавлена.");
                    }
                }
                case 4 -> {
                    System.out.println("Введите название книги, для ее поиска :");
                    scan.nextLine();
                    String title = scan.nextLine();
                    try {
                        bookshelf.setCount(bookshelf.findBook(title) + 1);
                    } catch (NumberFormatException e) {
                        System.err.println("Книга не найдена");
                    }
                    showVisualization(bookshelf.getCount());

                }
                case 5 -> {
                    System.out.println("Количество книг на полке : " +
                            bookshelf.showNumberAllBook());
                }
                case 6 -> System.out.println("Количество свободного места : " + bookshelf.showNumberFreeSpace());
                case 7 -> reply = "exit";
            }
            System.out.println("Актуальное состояние книжной полки: ");
            bookshelf.setCount(Bookshelf.getMaxBooksCount());
            showVisualization(Bookshelf.getMaxBooksCount());
        } while (!reply.equals("exit"));
    }

    private static void showVisualization(int index) {
        for (int i = 0; i < Bookshelf.getBooks().length; i++) {
            if (index < Bookshelf.getMaxBooksCount() && i == index - 1) {
                System.out.printf("<");
                System.out.printf(i + 1 + " ");
                System.out.format("%-" + 20 + "s", Bookshelf.getBooks()[i].getAuthor());
                System.out.format("%-" + 25 + "s", Bookshelf.getBooks()[i].getTitle());
                System.out.format("%-" + 4 + "s", Bookshelf.getBooks()[i].getYearPublication());
                System.out.printf(">");
                System.out.print("\n");
            } else if (index == Bookshelf.getMaxBooksCount()) {
                System.out.printf("<");
                System.out.printf(i + 1 + " ");
                System.out.format("%-" + 20 + "s", Bookshelf.getBooks()[i].getAuthor());
                System.out.format("%-" + 25 + "s", Bookshelf.getBooks()[i].getTitle());
                System.out.format("%-" + 4 + "s", Bookshelf.getBooks()[i].getYearPublication());
                System.out.printf(">");
                System.out.print("\n");
            }
        }
    }
}