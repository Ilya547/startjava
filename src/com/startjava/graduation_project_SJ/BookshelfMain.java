package com.startjava.graduation_project_SJ;

import java.util.Scanner;

public class BookshelfMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Bookshelf bookshelf = new Bookshelf(10);
        String reply;
        do {
            bookshelf.launch();
            do {
                System.out.println("Вы хотите продолжить?");
                reply = scan.nextLine();
            } while (!reply.equals("yes") && !reply.equals("no"));
        } while (reply.equals("yes"));

    }
}
