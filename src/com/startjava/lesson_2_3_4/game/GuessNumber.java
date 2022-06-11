package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private static int targetNumber = 0;
    private Scanner scan = new Scanner(System.in);
    private static Random r = new Random();
    private Player[] players;

    public GuessNumber(Player[] Players) {
        this.players = Players;
        for (int i = 0; i < players.length; i++) {
            System.out.println("Введите имя игрока");
            players[i] = new Player(scan.next());
        }
    }

    public void launch() {
        clearWinnerNumbers();
        castLots();
        for (int i = 0; i < players.length; i++) {
            clearNumbersAndTarget();
            System.out.println("У каждого игрока есть " + players[0].getMaxCount() + " попыток, чтобы угадать число.\n"
                    + "Победитель определяется по результатам трех игр.");
            for (int k = 0; k < players[0].getMaxCount(); k++) {
                installTargetNumber();
                for (int j = 0; j < players.length; j++) {
                    enterNumber(players[j]);
                    if (compareNumbers(players[j])) {
                        k = players[0].getMaxCount() + 1;
                        break;
                    }
                    checkNumbersAttempts(players[j]);
                }
            }
            showNumbers();
        }
        System.out.println(checkWinner());

    }

    private void clearWinnerNumbers() {
        for (int i = 0; i < players.length - 1; i++) {
            if (players[i].getNumberWins() != 0) {
                players[i].setNumberWins(0);
            }
        }
    }

    private void castLots() {
        for (int i = players.length - 1; i > 0; i--) {
            Player tmp = players[i];
            int rnd = r.nextInt(i) + 1;
            players[i] = players[rnd];
            players[rnd] = tmp;
        }
    }

    private void clearNumbersAndTarget() {
        for (int i = 0; i < players.length; i++) {
            Arrays.fill(players[i].getNumbers(), 0, players[i].getCount(), 0);
            players[i].setCount(0);
        }
        targetNumber = 0;
    }

    private static void installTargetNumber() {
        if (targetNumber == 0) {
            targetNumber = r.nextInt(100) + 1;
        }
    }

    private void enterNumber(Player player) {
            System.out.println(player.getName() + ",введите число в диапазоне (0, 100]");
            player.setNumber(scan.nextInt());
    }

    private boolean compareNumbers(Player player) {
        String strStart = "Данное число";
        String strFinish = " того, что загадал компьютер. Ход переходит к другому игроку.";
        if (player.getCurrentNumber() != targetNumber) {
            System.out.println(player.getCurrentNumber() > targetNumber ? strStart + " больше" + strFinish
                    : strStart + " меньше" + strFinish);
            return false;
        }
        player.setNumberWins();
        System.out.println("Игрок " + player.getName() + " угадал число " + targetNumber + " с " + player.getCount() +
                " попытки.\nЭто победа под номером " + player.getNumberWins() + ".");
        return true;
    }

    private void checkNumbersAttempts(Player player) {
        if (player.getCount() == player.getMaxCount()) {
            System.out.println("У " + player.getName() + " закончились попытки.");
        } else {
            System.out.println("");
        }
    }

    private void showNumbers() {
        for (int i = 0; i < players.length; i++) {
            int[] copyArrayNumbers = players[i].getNumbers();
            for (int number : copyArrayNumbers) {
                System.out.print(number + " ");
            }
            System.out.println(" ");
        }
    }

    private String checkWinner() {
        int max = players[0].getNumberWins();
        for (int i = 0; i < players.length - 1; i++) {
            if (players[i + 1].getNumberWins() > max) {
                return "Победу одержал игрок " + players[i + 1].getName() + " !";
            } else if (max > players[2].getNumberWins()) {
                return "Победу одержал игрок " + players[0].getName() + " !";
            } else {
                return "Победитель не выявлен.";
            }
        }
        return null;
    }
}

