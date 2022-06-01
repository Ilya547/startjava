package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] numbers = new int[10];
    private int count = 0;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getNumbers() {
        int[] copyNumbers = Arrays.copyOf(numbers, numbers.length);
        return copyNumbers;
    }

    public void setNumber(int numbers) {
        this.numbers[count] = numbers;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count += count;
    }
}