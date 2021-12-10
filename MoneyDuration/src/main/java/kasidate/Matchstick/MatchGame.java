package kasidate.Matchstick;

import java.util.Scanner;
public class MatchGame {
    public static void main (String[] args) {
        int numMatches=0;
        int player = 0;
        Matchstick game = new Matchstick(20);
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Player " + player + " >> ");
            numMatches = input.nextInt();
            if (game.isValidMove(numMatches)){
                game.takeMatches(numMatches);
                player = (player + 1) % 2;
            }
        } while (!game.isGameOver());
        System.out.println("Player " + ((player + 1) % 2) + " wins");
    }
}