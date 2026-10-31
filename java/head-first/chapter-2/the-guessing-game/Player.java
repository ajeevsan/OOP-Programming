import java.util.Scanner;

public class Player {

    int number;
    int playerNumber;
    Scanner sc;

    public Player(Scanner sc, int playerNumber) {
        this.sc = sc;
        this.playerNumber = playerNumber;
    }

    public int guess() {
        System.out.print("Player "+playerNumber+", Please enter the guess number: ");
        number = sc.nextInt();
        return number;
    }
}