import java.util.Scanner;
import java.util.Random;
public class GuessNumberTest {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Введите имя первого игрока");

        Player playerOne = new Player(scan.next());

        System.out.println("Введите имя второго игрока");

        Player playerTwo = new Player(scan.next());

        GuessNumber GuessNumberOne = new GuessNumber(playerOne.getName(), playerTwo.getName());

        Random r = new Random();

        GuessNumberOne.setTargetNumber(r.nextInt(101) + 1);

        GuessNumberOne.setReply("yes");

        while (GuessNumberOne.getReply().equals("yes")) {
            System.out.println(playerOne.getName() + ", введите число");

            GuessNumberOne.setnumberGame(scan.nextInt());

            GuessNumberOne.runGame();

            if (GuessNumberOne.getnumberGame() != GuessNumberOne.getTargetNumber()) {
                System.out.println(playerTwo.getName() + ", введите число");

                GuessNumberOne.setnumberGame(scan.nextInt());

                GuessNumberOne.runGame();
            }

            while ((!GuessNumberOne.getReply().equals("yes")) && (!GuessNumberOne.getReply().equals("no"))) {
                GuessNumberOne.setReply(scan.nextLine());
                System.out.println("Хотите продолжить игру? [yes/no]:");
                if (GuessNumberOne.getReply().equals("yes")) {
                    GuessNumberOne.setTargetNumber(r.nextInt(101) + 1);
                } 
            }
        }
    }
}