package com.startjava.lesson_2_3_4.game;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private int targetNumber;
    private Scanner scan = new Scanner(System.in);
    Random r = new Random();
    private Player[] arrPlayers;

    public GuessNumber(Player[] arrPlayers) {
        this.arrPlayers = arrPlayers;
    }

    public void setQueue() {
        for (int i = arrPlayers.length - 1; i > 0; i--) {
            Player tmp = arrPlayers[i];
            int rnd = r.nextInt(2) + 1;
            arrPlayers[i] = arrPlayers[rnd];
            arrPlayers[rnd] = tmp;
        }
    }

    public void launch() {
        setQueue();
        for (int i = 0; i < 3; i++) {
            arrPlayers[0].clearNumbers();
            arrPlayers[1].clearNumbers();
            arrPlayers[2].clearNumbers();
            targetNumber = r.nextInt(100) + 1;
            System.out.println(targetNumber);
            System.out.println("У каждого игрока есть " + arrPlayers[0].getMaxCount() +  " попыток, чтобы угадать число. Победитель определяется по результатам трех игр");
            while (arrPlayers[2].getCount() != arrPlayers[2].getMaxCount()) {
                enterNumber(arrPlayers[0]);
                if (compareNumbers(arrPlayers[0])) {
                    break;
                }
                checkNumbersAttempts(arrPlayers[0]);
                enterNumber(arrPlayers[1]);
                if (compareNumbers(arrPlayers[1])) {
                    break;
                }
                checkNumbersAttempts(arrPlayers[1]);
                enterNumber(arrPlayers[2]);
                if (compareNumbers(arrPlayers[2])) {
                    break;
                }
            }
            showNumbers(arrPlayers[0]);
            showNumbers(arrPlayers[1]);
            showNumbers(arrPlayers[2]);
        }
        System.out.println(checkWinner());
        cleanWinnerNumbers();
    }

    private void enterNumber(Player player) {
        System.out.println(player.getName() + ",введите число в диапазоне (0, 100]");
        player.setNumber(scan.nextInt());
    }

    private boolean compareNumbers(Player player) {
        String str = "Данное число больше того, что загадал компьютер. Ход переходит к другому игроку.";
        String[] string = str.split(" ");
        if (player.getCurrentNumber() != targetNumber) {
            string[2] = player.getCurrentNumber() > targetNumber ? "больше" :  "меньше";
            for (String word : string) {
                System.out.print(word + " ");
            }
            return false;
        }
        player.setNumberWins(1);
        System.out.println("Игрок " + player.getName() + " угадал число " + targetNumber + " с " + player.getCount() + " попытки. Это победа под номером " + player.getNumberWins());
        return true;
    }

    private void checkNumbersAttempts(Player player) {
        if (player.getCount() == player.getMaxCount()) {
            System.out.println("У " + player.getName() + " закончились попытки.");
        } else {
            System.out.println("");
        }
    }

    private void showNumbers(Player player) {
        int[] copyArrayNumbers = player.getNumbers();
            for (int number : copyArrayNumbers) {
                System.out.print(number + " ");
            }
        System.out.println(" ");
    }

    private String checkWinner() {
        int max = arrPlayers[0].getNumberWins();
        for (int i = 0; i < arrPlayers.length - 1; i++) {
            if (arrPlayers[i + 1].getNumberWins() > max) {
                return "Победу одержал игрок " + arrPlayers[i + 1].getName() + " !";
            } else if (max > arrPlayers[2].getNumberWins()) {
                return "Победу одержал игрок " + arrPlayers[0].getName() + " !";
            } else {
                return "Победила дружба! Каждый игрок угадал число один раз из трех.";
            }
        }
        return null;
    }

    private void cleanWinnerNumbers() {
        for (int i = 0; i < arrPlayers.length - 1; i++) {
            if (arrPlayers[i].getNumberWins() != 0) {
                arrPlayers[i].setNumberWins(0);
            }
        }
    }
}

