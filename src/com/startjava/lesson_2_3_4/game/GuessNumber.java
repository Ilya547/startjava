package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
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
        System.out.println("У каждого игрока есть 10 попыток, чтобы угадать число.");
        Random r = new Random();
        int targetNumber = r.nextInt(101) + 1;
        Scanner scan = new Scanner(System.in);
        int playerNumber = 101;
        int i = 0;
        int j = 0;
        do {
            System.out.println("targetNumber " + targetNumber);
            if (playerNumber != targetNumber) {
                while (i < playerOne.arrayNumberOne.length) {
                    System.out.println(playerOne.getName() + " ,введите число в диапазоне (0, 100]");
                    playerOne.setCounterOne(i +1);
                    playerOne.arrayNumberOne[i] = scan.nextInt();
                    playerNumber = playerOne.arrayNumberOne[i];
                    if (playerNumber > targetNumber) {
                        System.out.println("Данное число больше того, что загадал компьютер. Ход переходит к игроку : " + playerTwo.getName());
                        i++;
                        break;
                    } else if (playerNumber < targetNumber) {
                        System.out.println("Данное число меньше того, что загадал компьютер. Ход переходит к игроку : " + playerTwo.getName());
                        i++;
                        break;
                    } else if (playerNumber == targetNumber) {
                        System.out.println("Игрок : " + playerOne.getName() + " угадал  : " + playerNumber + " с " + (i + 1) + " попытки");
                        break;
                    }
                }
            }
            if (i == playerOne.arrayNumberOne.length) {
                System.out.println("У " + playerOne.getName() + " закончились попытки."
                );
            }
            if (playerNumber != targetNumber) {
                while (j < playerTwo.arrayNumberTwo.length) {
                    System.out.println(playerTwo.getName() + " ,введите число в диапазоне (0, 100]");
                    playerTwo.setCounterTwo(j + 1);
                    playerTwo.arrayNumberTwo[j] = scan.nextInt();
                    playerNumber = playerTwo.arrayNumberTwo[j];
                    if (playerNumber > targetNumber) {
                        System.out.println("Данное число больше того, что загадал компьютер. Ход переходит к игроку : " + playerOne.getName());
                        j++;
                        break;
                    } else if (playerNumber < targetNumber) {
                        System.out.println("Данное число меньше того, что загадал компьютер. Ход переходит к игроку : " + playerOne.getName());
                        j++;
                        break;
                    } else if (playerNumber == targetNumber) {
                        System.out.println("Игрок : " + playerTwo.getName() + " угадал  : " + playerNumber + " с " + (j + 1) + " попытки");
                        break;
                    }
                }
            } else {
                break;
            }
            if (i == playerOne.arrayNumberOne.length) {
                System.out.println("У " + playerTwo.getName() + " закончились попытки."
                );
            }
        } while (i != playerOne.arrayNumberOne.length || j != playerTwo.arrayNumberTwo.length);
        }

    public void showNumbers() {
        if (playerOne.getCounterOne() != playerOne.arrayNumberOne.length) {
            int [] copyArrayNumberOne = Arrays.copyOf(playerOne.arrayNumberOne, playerOne.getCounterOne());
            System.out.println(Arrays.toString(copyArrayNumberOne));
        } else {
            for (int i = 0; i < playerOne.arrayNumberOne.length; i ++) {
                System.out.print(playerOne.arrayNumberOne[i] + " ");
            }
            System.out.println(" ");
        }
        if (playerTwo.getCounterTwo() != playerTwo.arrayNumberTwo.length) {
            int [] copyArrayNumberTwo = Arrays.copyOf(playerTwo.arrayNumberTwo, playerTwo.getCounterTwo());
            System.out.println(Arrays.toString(copyArrayNumberTwo));
        } else {
            for (int i = 0; i < playerTwo.arrayNumberTwo.length; i++) {
                System.out.print(playerTwo.arrayNumberTwo[i] + " ");
            }
        }
    }
}