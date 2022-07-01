package com.startjava.graduation;

import java.util.Arrays;
import java.util.Scanner;

public class Bookshelf {
    private Scanner scan = new Scanner(System.in);
    private static Book[] books;
    private int booksCount = 5;

    private static int maxBooksCount = 9;

    private static int count;

    public Bookshelf(int arrayLength) {
        books = new Book[arrayLength];
        books[0] = new Book("Михаил Булгаков", "Мастер и Маргарита", "1940");
        books[1] = new Book("Ильф & Петров", "Двенадцать стульев", "1928");
        books[2] = new Book("Николай Гоголь", "Мёртвые души", "1842");
        books[3] = new Book("Михаил Булгаков", "Собачье сердце", "1925");
        books[4] = new Book("Александр Дюма", "Граф Монте-Кристо", "1845");
        books[5] = new Book(" ", "  ", " ");
        books[6] = new Book(" ", "  ", " ");
        books[7] = new Book(" ", "  ", " ");
        books[8] = new Book(" ", "  ", " ");
        books[9] = new Book(" ", "  ", " ");
    }

    public static Book[] getBooks() {
        return Arrays.copyOf(books, count);
    }

    public static int getMaxBooksCount() {
        return maxBooksCount;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void deleteBook(int numberDelete) {
        if (numberDelete > 0 && numberDelete <= books.length + 1) {
            System.arraycopy(books, numberDelete, books, numberDelete - 1, books.length - numberDelete);
            booksCount -= 1;
        } else {
            System.err.println("Ошибка!Необходимо ввести число от 1 до 10.");
        }
    }

    public void changeBookPosition(int positionOrigin, int positionDestination) {
        Book tmp = books[positionOrigin];
        books[positionOrigin] = books[positionDestination];
        books[positionDestination] = tmp;
    }

    public boolean addBook(Book newBook) {
        System.out.println("Ниже указаны ячейки, доступные для добавления : ");
        int[] result = new int[books.length];
        for (int i = 0; i < books.length; i++) {
            if (books[i].getTitle().equals("  ")) {
                result[i] = i;
                System.out.printf(i + 1 + ", ");
                if (i == books.length - 1) {
                    System.out.println("\nВведите номер ячейки : ");
                    int numberNewBook = scan.nextInt();
                    for (i = 0; i < result.length; i++) {
                        if (result[numberNewBook - 1] != 0) {
                            books[numberNewBook - 1] = newBook;
                            System.out.println("Книга добавлена.");
                            booksCount += 1;
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public int findBook(String title) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getTitle().equals(title)) {
                return i;
            }
        }
        String str = "Книга не найдена.";
        return Integer.parseInt(str);
    }

    public int showNumberAllBook() {
        return booksCount;
    }

    public int showNumberFreeSpace() {
        return maxBooksCount - booksCount;
    }
}