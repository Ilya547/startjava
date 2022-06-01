package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player playerOne;
    private Player playerTwo;
    private int targetNumber;
    private  Scanner scan = new Scanner(System.in);

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void launch() {
        clearNumbers(playerOne);
        clearNumbers(playerTwo);
        Random r = new Random();
        targetNumber = r.nextInt(100) + 1;
        System.out.println("targetNumber " + targetNumber);
        System.out.println("У каждого игрока есть 10 попыток, чтобы угадать число.");
        while (playerTwo.getCount() != playerTwo.getNumbers().length) {
            enterNumbers(playerOne);
            compareNumbers(playerOne, targetNumber);
            System.out.println(checkNumbersAttempts(playerOne));
            System.out.println("playerOne.getNumbers()[playerOne.getCount() -1] " + playerOne.getNumbers()[playerOne.getCount() - 1]);
            if (playerOne.getNumbers()[playerOne.getCount() - 1] == targetNumber) {
                break;
            } else {
                enterNumbers(playerTwo);
                compareNumbers(playerTwo, targetNumber);
                System.out.println(checkNumbersAttempts(playerTwo));
                if (playerTwo.getNumbers()[playerTwo.getCount() - 1] == targetNumber) {
                    break;
                }
            }
        }
        showNumbers(playerOne);
        showNumbers(playerTwo);
    }

    private void enterNumbers(Player player) {
        System.out.println(player.getName() + ",введите число в диапазоне (0, 100]");
        player.setNumber(scan.nextInt());
    }

    private boolean compareNumbers(Player player, int compNumber) {
        player.setCount(1);
        if (player.getNumbers()[player.getCount() - 1] > compNumber) {
            System.out.println("Данное число больше того, что загадал компьютер. Ход переходит к другому игроку.");
            return true;
        } else if (player.getNumbers()[player.getCount() - 1] < compNumber) {
            System.out.println("Данное число меньше того, что загадал компьютер. Ход переходит к другому игроку.");
            return true;
        }
        else {
            System.out.println("Игрок " + player.getName() + " угадал число " + compNumber + " с " + player.getCount() + " попытки");
            return false;
        }
    }

    private void showNumbers(Player player) {
        int[] copyArrayNumbers = Arrays.copyOf(player.getNumbers(), player.getCount());
        if (player.getCount() != player.getNumbers().length) {
            for(int i = 0; i < copyArrayNumbers.length; i++) {
                System.out.print(copyArrayNumbers[i] + " ");
            }
        } else {
            for(int i = 0; i < copyArrayNumbers.length; i++) {
                System.out.print(copyArrayNumbers[i] + " ");
            }
        }
        System.out.println(" ");
    }

    private String checkNumbersAttempts(Player player) {
        if (player.getCount() == player.getNumbers().length && player.getNumbers()[player.getCount() - 1] != targetNumber) {
            return "У " + player.getName() + " закончились попытки.";
        } else {
            return "";
        }
    }

    private void clearNumbers(Player player) {
        Arrays.fill(player.getNumbers(), 0, player.getCount(), 0);
        player.setCount(0);
    }
}

