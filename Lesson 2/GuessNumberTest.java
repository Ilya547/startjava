import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите имя первого игрока");
        Player playerOne = new Player(scan.next());

        System.out.println("Введите имя второго игрока");
        Player playerTwo = new Player(scan.next());

        GuessNumber game = new GuessNumber(playerOne, playerTwo);
        game.setReply("yes");
        while (game.getReply().equals("yes")) {
            game.launch();
            while ((!game.getReply().equals("yes")) && (!game.getReply().equals("no"))) {
                System.out.println("Хотите продолжить игру? [yes/no]:");
                game.setReply(scan.nextLine());
            } 
        }
        
    }
}