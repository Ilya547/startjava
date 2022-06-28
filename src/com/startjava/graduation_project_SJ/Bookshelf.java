package com.startjava.graduation_project_SJ;

import java.util.Scanner;

public class Bookshelf {
    private static Scanner scan = new Scanner(System.in);
    private Book[] books;
    public Bookshelf(int index) {
        Book[] books = new Book[index];
        this.books = books;
        books[0] = new Book("Михаил Булгаков", "Мастер и Маргарита", "1940");
        books[1] = new Book(" ", "  ", "  ");
        books[2] = new Book("Николай Гоголь", "Мёртвые души", "1842");
        books[3] = new Book(" ", "  ", " ");
        books[4] = new Book("Ильф & Петров", "Двенадцать стульев", "1928");
        books[5] = new Book(" ", "  ", " ");
        books[6] = new Book(" ", "  ", " ");
        books[7] = new Book("Михаил Булгаков", "Собачье сердце", "1925");
        books[8] = new Book("Александр Дюма", "Граф Монте-Кристо", "1845");
        books[9] = new Book(" ", "  ", " ");
    }

    public void launch() {
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
            case 1 -> deleteBook();
            case 2 -> changeBookPosition();
            case 3 -> {
                if (!addBook()) {
                    System.err.println("Книга не добавлена.");
                }
            }
            case 4 -> {
                if (!searchBook()) {
                    System.err.println("Книга не найдена.");
                }
            }
            case 5 -> showNumberAllBook();
            case 6 -> showNumberFreeSpace();
        }
        currentStatusShelf();
    }

    private void currentStatusShelf() {
        System.out.println("Актуальное состояние книжной полки: ");
        for (int i = 0; i < books.length; i++) {
            System.out.printf("<");
            System.out.printf(i + 1 + " ");
            System.out.format("%-" + 20 + "s", books[i].getAuthor());
            System.out.format("%-" + 25 + "s", books[i].getTitle());
            System.out.format("%-" + 4 + "s", books[i].getYearPublication());
            System.out.printf(">");
            System.out.print("\n");
        }
    }

    private void deleteBook() {
        System.out.println("Введите номер книги для удаления : ");
        int numberDelete = scan.nextInt();
        if (numberDelete > 0 && numberDelete <= books.length + 1) {
            System.arraycopy(books, numberDelete, books, numberDelete - 1, books.length - numberDelete);
        } else {
            System.err.println("Ошибка!Необходимо ввести число от 1 до 10.");
        }
    }

    private void changeBookPosition() {
        System.out.println("Введите номер книги для перемещения : ");
        int positionOrigin = scan.nextInt() - 1;
        System.out.println("Введите новое место для книги : ");
        int positionDestination = scan.nextInt() - 1;
        Book tmp = books[positionOrigin];
        books[positionOrigin] = books[positionDestination];
        books[positionDestination] = tmp;
    }

    private boolean addBook() {
        System.out.println("Ниже указаны ячейки, доступные для добавления : ");
        int[] result = new int[books.length];
        for (int i = 0; i < books.length; i++) {
            if (books[i].getTitle().equals("  ")) {
                result[i] = i;
                System.out.printf(i + 1 + ", ");
                if (i == books.length - 1) {
                    System.out.println("\nВведите автора, название и год выпуска книги(используйте Enter в качестве разделителя) :");
                    scan.nextLine();
                    Book newBook = new Book(scan.nextLine(), scan.nextLine(), scan.nextLine());
                    System.out.println("\nВведите номер ячейки : ");
                    int numberNewBook = scan.nextInt();
                    for (i = 0; i < result.length; i++) {
                        if (result[numberNewBook - 1] != 0) {
                            books[numberNewBook - 1] = newBook;
                            System.out.println("Книга добавлена.");
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    private boolean searchBook() {
        System.out.println("Введите название книги, для ее поиска :");
        scan.nextLine();
        String title = scan.nextLine();
        for (int i = 0; i < books.length; i++) {
            if (books[i].getTitle().equals(title)) {
                System.out.printf("<");
                System.out.printf(i + 1 + " ");
                System.out.format("%-" + 20 + "s", books[i].getAuthor());
                System.out.format("%-" + 25 + "s", books[i].getTitle());
                System.out.format("%-" + 4 + "s", books[i].getYearPublication());
                System.out.printf(">\n");
                return true;
            }
        }
        return false;
    }

    private void showNumberAllBook() {
        int numberAllBook = 0;
        for (Book book : books) {
            if (!book.getTitle().equals("  ")) {
                numberAllBook += 1;
            }
        }
        System.out.println("Количество книг на полке = " + numberAllBook);
    }

    private void showNumberFreeSpace() {
        int numberFreeSpace = 0;
        for (Book book : books) {
            if (book.getTitle().equals("  ")) {
                numberFreeSpace += 1;
            }
        }
        System.out.println("Количество свободных мест на полке = " + numberFreeSpace);
    }
}
