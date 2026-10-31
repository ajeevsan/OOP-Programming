import java.util.Scanner;

public class GameLauncher {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GuessGame game = new GuessGame(sc);
        game.startGame();
        sc.close();
    }
}