package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Random;

public class GuessNumber {
    private Player playerOne;
    private Player playerTwo;

    static int playerNumber;

    static int targetNumber;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void launch() {
        playerOne.clearNumbers();
        playerTwo.clearNumbers();
        Random r = new Random();
        targetNumber = r.nextInt(100) + 1;
        System.out.println("targetNumber " + targetNumber);
        System.out.println("У каждого игрока есть 10 попыток, чтобы угадать число.");
        while (playerNumber != targetNumber && playerTwo.getCount() != playerTwo.getNumbers().length) {
            playerOne.enterNum();
            System.out.println(playerOne.checkNum());
            System.out.println(playerOne.checkNumAttempts());
            if (playerNumber == targetNumber) {
                break;
            } else {
                playerTwo.enterNum();
                System.out.println(playerTwo.checkNum());
                System.out.println(playerTwo.checkNumAttempts());
            }
            System.out.println(Arrays.toString(playerOne.getNumbers()));
            System.out.println(Arrays.toString(playerTwo.getNumbers()));
        }
        System.out.println(playerOne.showNumbers());
        System.out.println(playerTwo.showNumbers());
    }
}

