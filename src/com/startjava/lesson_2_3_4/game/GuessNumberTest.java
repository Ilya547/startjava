package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Player[] players = new Player[3];

        GuessNumber game = new GuessNumber(players);

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