package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private int maxCount = 10;
    private String name;
    private int[] numbers = new int[maxCount];
    private int count = 0;

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
        Arrays.copyOf(numbers, count);
        return numbers[count - 1];
    }

    public void setNumber(int number) {
        this.numbers[count] = number;
        count++;
    }

    public int getCount() {
        return count;
    }

    public void clearNumbers() {
        Arrays.fill(numbers, 0, count, 0);
        count = 0;
    }
}