package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private int maxCount = 10;
    private String name;
    private int[] numbers = new int[maxCount];
    private int count = 0;
    private int numberWins = 0;

    public Player(String name) {
        this.name = name;
    }

    public int getMaxCount() {
        return maxCount;
    }

    public String getName() {
        return name;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, count);
    }

    public int getCurrentNumber() {
        return numbers[count - 1];
    }

    public void setNumber(int number) {
        if (number < 101 && number > 0) {
            numbers[count] = number;
        } else {
            System.err.println("Данное число не входит в диапазон (0, 100]. Ход переходит другому игроку.");
        }
        count++;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getNumberWins() {
        return numberWins;
    }

    public void setNumberWins(int numberW) {
        numberWins = numberW;
    }

    public void setNumberWins() {
        numberWins++;
    }
}