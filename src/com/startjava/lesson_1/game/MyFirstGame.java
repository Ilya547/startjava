package com.startjava.lesson_1.game;

public class MyFirstGame {
    public static void main(String[] args) {
        //2.Игра “Угадай число”
        System.out.println("2.Игра “Угадай число”");
        int minNumber = 0;
        int maxNumber = 100;
        int targetNumber = 1;
        int playerNumber = 100;
        while (playerNumber != targetNumber) {
            playerNumber = (maxNumber + minNumber) / 2;
            if (playerNumber > targetNumber) {
                System.out.print(playerNumber);
                System.out.print(" больше того, что загадал компьютер\n");
                maxNumber = playerNumber;
            } else if (playerNumber < targetNumber) {
                System.out.print(playerNumber);
                System.out.print(" меньше того, что загадал компьютер\n");
                minNumber = playerNumber;
            }
        }
        System.out.print(playerNumber + " Вы победили!");
    }   
}