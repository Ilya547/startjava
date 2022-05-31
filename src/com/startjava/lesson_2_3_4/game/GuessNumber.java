package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player playerOne;
    private Player playerTwo;
    static int playerNumber;
    static int targetNumber;
    static Scanner scan = new Scanner(System.in);

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
            System.out.println(playerOne.getCount());
            enterNum(playerOne);
            System.out.println(checkNum(playerOne));
            System.out.println(checkNumAttempts(playerOne));
            if (playerNumber == targetNumber) {
                break;
            } else {
                enterNum(playerTwo);
                System.out.println(checkNum(playerTwo));
                System.out.println(checkNumAttempts(playerTwo));
            }
        }
        System.out.println(showNumbers(playerOne));
        System.out.println(showNumbers(playerTwo));
    }

    public static void enterNum(Player player) {
        System.out.println(player.getName() + ",введите число в диапазоне (0, 100]");
        player.setNumbers(scan.nextInt());
        playerNumber = player.getNumbers()[player.getCount()];
    }

    public String checkNum(Player player) {
        if (playerNumber > targetNumber) {
            player.setCount(1);
            return "Данное число больше того, что загадал компьютер. Ход переходит к другому игроку.";
        } else if (playerNumber < targetNumber) {
            player.setCount(1);
            return "Данное число меньше того, что загадал компьютер. Ход переходит к другому игроку.";
        }
        else {
            player.setCount(1);
            return "Игрок " + player.getName() + " угадал число " + player.getNumbers()[player.getCount() - 1] + " с " + player.getCount() + " попытки";
        }
    }

    public String showNumbers(Player player) {
        int [] copyArrayNumbers = Arrays.copyOf(player.getNumbers(), player.getCount());
        if (player.getCount() != player.getNumbers().length) {
            return Arrays.toString(copyArrayNumbers);
        } else {
            return Arrays.toString(copyArrayNumbers);
        }
    }

    public String checkNumAttempts(Player player) {
        if (player.getCount() == player.getNumbers().length) {
            return "У " + player.getName() + " закончились попытки.";
        } else {
            return "";
        }
    }
}

