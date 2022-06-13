package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private int targetNumber;
    private Scanner scan = new Scanner(System.in);
    private Random r = new Random();
    private Player[] players;
    private String winner = "Победитель не выявлен.";

    public GuessNumber(int index) {
        Player[] players = new Player[index];
        this.players = players;
        for (int i = 0; i < index; i++) {
            System.out.println("Введите имя игрока");
            players[i] = new Player(scan.next());
        }
    }

    public void launch(int round) {
        clearWinnerNumbers();
        castLots();
        for (int i = 0; i < round; i++) {
            initGame();
            System.out.println("У каждого игрока есть " + players[0].getMaxCount() + " попыток, чтобы угадать число.\n"
                    + "Победитель определяется по результатам трех игр.");
            for (int j = 0; j < players[0].getMaxCount(); j++) {
                installTargetNumber();
                System.out.println("targe= " + targetNumber);
                for (int k = 0; k < players.length; k++) {
                    enterNumber(players[k]);
                    if (compareNumbers(players[k])) {
                        j = players[0].getMaxCount() + 1;
                        break;
                    }
                    checkNumbersAttempts(players[k]);
                }
            }
            showNumbers();
        }
        checkWinner();
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

    private void initGame() {
        for (int i = 0; i < players.length; i++) {
            Arrays.fill(players[i].getNumbers(), 0, players[i].getCount(), 0);
            players[i].setCount(0);
        }
        targetNumber = 0;
    }

    private void installTargetNumber() {
        if (targetNumber == 0) {
            targetNumber = r.nextInt(100) + 1;
        }
    }

    private void enterNumber(Player player) {
        System.out.println(player.getName() + ",введите число в диапазоне (0, 100]");
        player.setNumber(scan.nextInt());
    }

    private boolean compareNumbers(Player player) {
        String wordMore = " больше";
        String wordless = " меньше";
        if (player.getCurrentNumber() != targetNumber) {
            System.out.println(player.getCurrentNumber() > targetNumber ? "Данное число" + wordMore + "того, что " +
                    "загадал компьютер. Ход переходит к другому игроку." : "Данное число" + wordless + "того, что " +
                    "загадал компьютер. Ход переходит к другому игроку.");
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

    private void checkWinner() {
        for (int i = 0; i < players.length - 1; i++) {
            if (players[i + 1].getNumberWins() > players[i].getNumberWins() ) {
                winner = players[i + 1].getName();
            } else if (players[i].getNumberWins() > players[i + 1].getNumberWins()) {
                winner = players[i].getName();
            }
        }
        System.out.println("Победу одержал игрок " + winner + " !");
    }
}