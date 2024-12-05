package U5T7_Part2;
import java.util.Scanner;

public class U5T7_2Runner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NumGame game = new NumGame(5);
        System.out.println("Welcome to the Coolest Number Game!");
        System.out.println("Would you like to know the rules? (y/n) ");
        if (sc.nextLine().equals("y")) {
            System.out.println("You have 5 guesses total.");
            System.out.println("You will have different options to attempt to find cool numbers, but this will count as a guess.");
            System.out.println("However, if you find a number that's cooler than any you've previously entered, you won't use a guess!");
        }
        System.out.println("Ready... Go!");
        while (game.isGameOver() == false) {
            System.out.println("Choose your preferred action:");
            System.out.println("1. Compare Coolness of 2 Numbers");
            System.out.println("2. Know the Coolest within the 5 Numbers above a Number.");
            int ans = sc.nextInt();
            sc.nextLine();
            if (ans == 1) {
                game.guessCoolerNum(sc);
            } else {
                game.guessCoolestNearby(sc);
            }
            System.out.println();
        }
        System.out.println("Thanks for playing!");
        sc.close();
    } 
}
