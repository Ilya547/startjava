package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Scanner;

import static com.startjava.lesson_2_3_4.game.GuessNumber.playerNumber;
import static com.startjava.lesson_2_3_4.game.GuessNumber.targetNumber;

public class Player {
    private String name;
    private int numbers[] = new int[10];
    private int count = 0;
    public Player(String name) {
        this.name = name;
    }

    public int [] getNumbers() {
        return numbers;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void clearNumbers() {
        Arrays.fill(numbers, 0, count, 0);
        count = 0;
    }

    public void enterNum() {
        Scanner scan = new Scanner(System.in);
        System.out.println(getName() + ",введите число в диапазоне (0, 100]");
        numbers[count] = scan.nextInt();
        playerNumber = numbers[count];
    }

public String checkNum() {
    if (playerNumber > targetNumber) {
        count++;
        return "Данное число больше того, что загадал компьютер. Ход переходит к другому игроку.";
    } else if (playerNumber < targetNumber) {
        count++;
        return "Данное число меньше того, что загадал компьютер. Ход переходит к другому игроку.";
    }
    else {
        count++;
        return "Игрок " + name + " угадал число " + numbers[count - 1] + " с " + count + " попытки";
    }
}

    public String checkNumAttempts() {
        System.out.println("heckNumAttempts count = " + count);
        if (count == numbers.length) {
            return "У " + getName() + " закончились попытки.";
        } else {
            return "";
        }
    }

    public String showNumbers() {
        if (count != numbers.length) {
            int [] copyArrayNumberOne = Arrays.copyOf(numbers, count);
            return Arrays.toString(copyArrayNumberOne);
        } else {
            return Arrays.toString(numbers);
        }
    }
}