package com.startjava.lesson_2_3_4.game;

public class Player {
    private String name;
    protected int[] arrayNumberOne = new int[10];
    protected int[] arrayNumberTwo = new int[10];
    private int counterOne;
    private int counterTwo;

    public Player(String name) {
        this.name = name;
    }

    public int getCounterOne() {
        return counterOne;
    }

    public void setCounterOne(int counterOne) {
        this.counterOne = counterOne;
    }

    public int getCounterTwo() {
        return counterTwo;
    }

    public void setCounterTwo(int counterTwo) {
        this.counterTwo = counterTwo;
    }

    public String getName() {
        return name;
    }
}