package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        GuessNumber game = new GuessNumber(3);
        String reply = "yes";

        do {
            if (reply.equals("yes")) {
                game.launch(3);
            }
            System.out.println("\nХотите продолжить игру? [yes/no]:");
            reply = scan.nextLine();
        } while (!reply.equals("no"));
    }
}