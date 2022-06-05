package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player playerOne;
    private Player playerTwo;
    private int targetNumber;
    private Scanner scan = new Scanner(System.in);

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void launch() {
        playerOne.clearNumbers();
        playerTwo.clearNumbers();
        Random r = new Random();
        targetNumber = r.nextInt(100) + 1;
        System.out.println("У каждого игрока есть " + playerOne.getMaxCount() +  " попыток, чтобы угадать число.");
        while (playerTwo.getCount() != playerTwo.getMaxCount()) {
            enterNumber(playerOne);
            if (!compareNumbers(playerOne)) {
                break;
            } else {
                System.out.println(checkNumbersAttempts(playerOne));
                enterNumber(playerTwo);
                if (!compareNumbers(playerTwo)) {
                    break;
                }
            }
            System.out.println(checkNumbersAttempts(playerTwo));
        }
        showNumbers(playerOne);
        showNumbers(playerTwo);
    }

    private void enterNumber(Player player) {
        System.out.println(player.getName() + ",введите число в диапазоне (0, 100]");
        player.setNumber(scan.nextInt());
    }

    private boolean compareNumbers(Player player) {
        if (player.getCurrentNumber() != targetNumber) {
            if (player.getCurrentNumber() > targetNumber) {
                System.out.println("Данное число больше того, что загадал компьютер. Ход переходит к другому игроку.");
            } else if (player.getCurrentNumber() < targetNumber) {
                System.out.println("Данное число меньше того, что загадал компьютер. Ход переходит к другому игроку.");
            }
            return true;
        }
        System.out.println("Игрок " + player.getName() + " угадал число " + targetNumber + " с " + player.getCount() + " попытки");
        return false;
    }

    private String checkNumbersAttempts(Player player) {
        if (player.getCount() == player.getMaxCount()) {
            return "У " + player.getName() + " закончились попытки.";
        } else {
            return "";
        }
    }

    private void showNumbers(Player player) {
        int[] copyArrayNumbers = Arrays.copyOf(player.getNumbers(), player.getCount());
            for (int copyArrayNumber : copyArrayNumbers) {
                System.out.print(copyArrayNumber + " ");
            }
        System.out.println(" ");
    }
}

