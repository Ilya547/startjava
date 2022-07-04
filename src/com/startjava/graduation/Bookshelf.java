package com.startjava.graduation;

import java.util.Arrays;
import java.util.Scanner;

public class Bookshelf {
    private Scanner scan = new Scanner(System.in);
    private Book[] books;
    private int countBooks = 5;

    public Bookshelf(int length) {
        books = new Book[length];
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

    public Book[] getBooks() {
        return Arrays.copyOf(books, books.length);
    }

    public void deleteBook(int numberDelete) {
        System.arraycopy(books, numberDelete, books, numberDelete - 1, books.length - numberDelete);
        countBooks--;
    }

    public void changeBookPosition(int positionOrigin, int positionDestination) {
        int origin = positionOrigin - 1;
        int destination = positionDestination - 1;
        Book tmp = books[origin];
        books[origin] = books[destination];
        books[destination] = tmp;
    }

    public boolean addBook(Book newBook) {
        System.out.println("Ниже указаны ячейки, доступные для добавления: ");
        int[] result = new int[books.length];
        for (int i = 0; i < books.length; i++) {
            if (books[i].getTitle().equals("  ")) {
                result[i] = i;
                System.out.printf(i + 1 + ", ");
                if (i == books.length - 1) {
                    System.out.println("\nВведите номер ячейки: ");
                    int numberNewBook = scan.nextInt();
                    for (i = 0; i < result.length; i++) {
                        if (result[numberNewBook - 1] != 0) {
                            books[numberNewBook - 1] = newBook;
                            System.out.println("Книга добавлена.");
                            countBooks++;
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
        return -1;
    }

    public int getCountBooks() {
        return countBooks;
    }

    public int getCountFreeSpace() {
        return books.length - countBooks;
    }
}