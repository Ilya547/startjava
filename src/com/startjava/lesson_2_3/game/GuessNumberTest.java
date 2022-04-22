package com.startjava.lesson_2_3.game;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите имя первого игрока");
        Player playerOne = new Player(scan.next());

        System.out.println("Введите имя второго игрока");
        Player playerTwo = new Player(scan.next());

        GuessNumber game = new GuessNumber(playerOne, playerTwo);

        String reply;
        do {
            game.launch();
            do {
                System.out.println("Хотите продолжить игру? [yes/no]:");
                reply = scan.nextLine();
            } while (!reply.equals("yes") && !reply.equals("no"));
        } while (reply.equals("yes"));
    }
}