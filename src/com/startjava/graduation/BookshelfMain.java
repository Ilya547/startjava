package com.startjava.graduation;

import java.util.Scanner;

public class BookshelfMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Bookshelf bookshelf = new Bookshelf(10);

        String reply;
        do {
            System.out.println("""
                Выберите действие с помощью чисел. 
                Пример : если вы хотите удалить книгу - введите 1 и нажмите Enter.
                1.Удалить книгу
                2.Переместить книгу
                3.Добавить книгу
                4.Искать книгу по названию
                5.Вывести число всех книг
                6.Показать количество свободного места
                Введите номер команды: """);
            int chooseAction = scan.nextInt();
            switch (chooseAction) {
                case 1 -> bookshelf.deleteBook();
                case 2 -> bookshelf.changeBookPosition();
                case 3 -> {
                    if (!bookshelf.addBook()) {
                        System.err.println("Книга не добавлена.");
                    }
                }
                case 4 -> {
                    if (!bookshelf.searchBook()) {
                        System.err.println("Книга не найдена.");
                    }
                }
                case 5 -> bookshelf.showNumberAllBook();
                case 6 -> bookshelf.showNumberFreeSpace();
            }
            bookshelf.currentStatusShelf();
            do {
                reply = scan.nextLine();
                System.out.println("Вы хотите продолжить?(yes/no)");
            } while (!reply.equals("yes") && !reply.equals("no"));
        } while (reply.equals("yes"));

    }
}
