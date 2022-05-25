package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    protected  int[] playerNumber = new int[3];
    private int counter;

    public Player(String name) {
        this.name = name;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public String getName() {
        return name;
    }

    public void showNumbers() {
        if (counter != playerNumber.length) {
            int [] copyArrayNumberOne = Arrays.copyOf(playerNumber, counter);
            System.out.println(Arrays.toString(copyArrayNumberOne));
        } else {
            for (int i = 0; i < playerNumber.length; i ++) {
                System.out.print(playerNumber[i] + " ");
            }
            System.out.println(" ");
        }
    }

    public void resetPlayerNumber() {
        Arrays.fill(playerNumber, 0, counter, 0);
    }

    public void checkNumAttempts() {
        if (counter == playerNumber.length) {
            System.out.println("У " + getName() + " закончились попытки.");
        }
    }
}