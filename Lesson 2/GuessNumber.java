import java.util.Random;

import java.util.Scanner;

public class GuessNumber {
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

    Random r = new Random();
    int targetNumber = r.nextInt(101) + 1;
    public void launch() {
        Scanner scan = new Scanner(System.in);
        int playerNumber = playerOne.getNumber();
        System.out.println("targetNumber " + targetNumber);
            while (playerNumber != targetNumber) {
                System.out.println(playerOne.getName() + " ,введите число");
                playerNumber = scan.nextInt();
                if (playerNumber > targetNumber) {
                    System.out.println("Данное число больше того, что загадал компьютер. Ход переходит к другому игроку :-(");
                    break;
                } else if (playerNumber < targetNumber) {
                    System.out.println("Данное число меньше того, что загадал компьютер. Ход переходит к другому игроку :-(");
                    break;
                } else if (playerNumber == targetNumber) {
                    System.out.println(playerOne.getName() + ", вы угадали!");
                    reply = "";
                    break;
                }
            }
            while (playerNumber != targetNumber) {
                playerNumber = playerTwo.getNumber();
                System.out.println(playerTwo.getName() + " ,введите число");
                playerNumber = scan.nextInt();
                if (playerNumber > targetNumber) {
                    System.out.println("Данное число больше того, что загадал компьютер. Ход переходит к другому игроку :-(");
                    break;
                } else if (playerNumber < targetNumber) {
                    System.out.println("Данное число меньше того, что загадал компьютер. Ход переходит к другому игроку :-(");
                    break;
                } else if (playerNumber == targetNumber) {
                    System.out.println(playerOne.getName() + ", вы угадали!");
                    reply = "";
                    break;
                }
            }
    }
}