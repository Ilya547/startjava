public class GuessNumber {
    private String nameOne;
    private String nameTwo;
    private int playerNumberGame;
    private int targetNumber;
    private String reply;

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

    public GuessNumber(String nameOne, String nameTwo) {
        this.nameOne = nameOne;
        this.nameTwo = nameTwo;
    } 

    public void runGame() {
        while (playerNumberGame > 0) {
            if ((playerNumberGame != targetNumber) && (playerNumberGame > targetNumber)) {
                System.out.println("Данное число больше того, что загадал компьютер. Ход переходит к другому игроку :-(");
                break;
            } else if ((playerNumberGame != targetNumber) && (playerNumberGame < targetNumber)) {
                System.out.println("Данное число меньше того, что загадал компьютер. Ход переходит к другому игроку :-(");
                System.out.println("введенное число " + playerNumberGame);
                break;
            } else if (playerNumberGame == targetNumber) {
                System.out.println("Вы угадали!");
                reply = "";
                break;
            } else {
                System.out.println("Вам необходимо ввести число в диапазоне от 0 до 100. Попробуйте еще.");
            }
        }
    }
}