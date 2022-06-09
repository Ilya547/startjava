package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите имя первого игрока");
        Player playerOne = new Player(scan.next());

        System.out.println("Введите имя второго игрока");
        Player playerTwo = new Player(scan.next());

        System.out.println("Введите имя третьего игрока");
        Player playerThree = new Player(scan.next());

        Player[] arrPlayers = {playerOne, playerTwo, playerThree};

        GuessNumber game = new GuessNumber(arrPlayers);

        String reply;
        do {
            game.launch();
            System.out.println("\nХотите продолжить игру? [yes/no]:");
            do {
                reply = scan.nextLine();
            } while (!reply.equals("yes") && !reply.equals("no"));
        } while (reply.equals("yes"));
    }
}