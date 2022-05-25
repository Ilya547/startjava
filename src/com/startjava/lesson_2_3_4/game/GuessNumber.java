package com.startjava.lesson_2_3_4.game;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player playerOne;
    private Player playerTwo;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void launch() {
        playerOne.resetPlayerNumber();
        playerTwo.resetPlayerNumber();
        int i = 0;
        int j = 0;
        int playerNumber;
        int counterOrder = 1;
        Random r = new Random();
        int targetNumber = r.nextInt(101) + 1;
        System.out.println("targetNumber " + targetNumber);
        System.out.println("У каждого игрока есть 10 попыток, чтобы угадать число.");
        Scanner scan = new Scanner(System.in);
        while (playerTwo.getCounter() != playerTwo.playerNumber.length) {
            if (counterOrder % 2 != 0) {
                System.out.println(playerOne.getName() + ",введите число в диапазоне (0, 100]");
                playerOne.playerNumber[i] = scan.nextInt();
                playerNumber = playerOne.playerNumber[i];
                i++;
            } else {
                System.out.println(playerTwo.getName() + ",введите число в диапазоне (0, 100]");
                playerTwo.playerNumber[j] = scan.nextInt();
                playerNumber = playerTwo.playerNumber[j];
                j++;
            }
            counterOrder++;
            if (playerNumber > targetNumber) {
                System.out.println("Данное число больше того, что загадал компьютер. Ход переходит к другому игроку.");
            } else if (playerNumber < targetNumber) {
                System.out.println("Данное число меньше того, что загадал компьютер. Ход переходит к другому игроку.");
            } else {
                if (counterOrder % 2 != 0) {
                    System.out.println("Игрок " + playerOne.getName() + " угадал число " + playerNumber + " с " + i + " попытки");
                } else {
                    System.out.println("Игрок " + playerTwo.getName() + " угадал число " + playerNumber + " с " + i + " попытки");
                }
                playerOne.setCounter(i);
                playerTwo.setCounter(j);
                break;
            }
            playerOne.checkNumAttempts();
            playerTwo.checkNumAttempts();
        }
        playerOne.showNumbers();
        playerTwo.showNumbers();
    }
}