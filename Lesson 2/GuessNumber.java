import java.util.Random;

import java.util.Scanner;

public class GuessNumber {
    private String nameOne;
    private String nameTwo;
    private int playerNumberGame;
    private int targetNumber;
    private String reply;
    private Player playerOne;
    private Player playerTwo;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply;
    }

    public int getTargetNumber() {
        return targetNumber;
    }

    public void setTargetNumber(int targetNumber) {
        this.targetNumber = targetNumber;
    }

    public int getPlayerNumberGame() {
        return playerNumberGame;
    }

    public void setPlayerNumberGame(int playerNumberGame) {
        this.playerNumberGame = playerNumberGame;
    }

    public void launch() {
        Random r = new Random();
        targetNumber = r.nextInt(101) + 1;
        System.out.println("targetNumber " + targetNumber);
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("введите число");
            playerNumberGame = scan.nextInt();
            if (playerNumberGame > targetNumber) {
                System.out.println("Данное число больше того, что загадал компьютер. Ход переходит к другому игроку :-(");
            } else if (playerNumberGame < targetNumber) {
                System.out.println("Данное число меньше того, что загадал компьютер. Ход переходит к другому игроку :-(");
            } else if (playerNumberGame == targetNumber) {
                System.out.println("Вы угадали!");
            } else {
                System.out.println("Вам необходимо ввести число в диапазоне от 0 до 100. Попробуйте еще.");
            }
        } while (playerNumberGame != targetNumber);
    }
}