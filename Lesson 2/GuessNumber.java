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
        Random r = new Random();
        int targetNumber = r.nextInt(101) + 1;
        Scanner scan = new Scanner(System.in);
        int playerNumber = 101;
        while (playerNumber != targetNumber) {
            System.out.println(playerOne.getName() + " ,введите число в диапазоне (0, 100]");
            playerOne.setNumber(scan.nextInt());
            playerNumber = playerOne.getNumber();
            if (playerNumber > targetNumber) {
                System.out.println("Данное число больше того, что загадал компьютер. Ход переходит к другому игроку :-(");
            } else if (playerNumber < targetNumber) {
                System.out.println("Данное число меньше того, что загадал компьютер. Ход переходит к другому игроку :-(");
            } else if (playerNumber == targetNumber) {
                System.out.println(playerOne.getName() + ", вы угадали!");
            }
            if (playerNumber != targetNumber) {
                playerNumber = playerTwo.getNumber();
                System.out.println(playerTwo.getName() + " ,введите число в диапазоне (0, 100]");
                playerNumber = scan.nextInt();
                if (playerNumber > targetNumber) {
                    System.out.println("Данное число больше того, что загадал компьютер. Ход переходит к другому игроку :-(");
                } else if (playerNumber < targetNumber) {
                    System.out.println("Данное число меньше того, что загадал компьютер. Ход переходит к другому игроку :-(");
                } else if (playerNumber == targetNumber) {
                    System.out.println(playerTwo.getName() + ", вы угадали!");
                }
            }
        }
    }
}