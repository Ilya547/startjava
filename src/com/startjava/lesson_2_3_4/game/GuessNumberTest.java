package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
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
            game.showNumbers();
            do {
                System.out.println("\nХотите продолжить игру? [yes/no]:");
                reply = scan.nextLine();
            } while (!reply.equals("yes") && !reply.equals("no"));
            Arrays.fill(playerOne.arrayNumberOne, 0, playerOne.getCounterOne(), 0);
            Arrays.fill(playerTwo.arrayNumberTwo, 0, playerTwo.getCounterTwo(), 0);
        } while (reply.equals("yes"));
    }
}