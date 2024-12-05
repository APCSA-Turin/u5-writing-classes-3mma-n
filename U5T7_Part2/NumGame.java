package U5T7_Part2;
import java.util.Scanner;
public class NumGame {
    private int coolest;
    private int guesses;
    private int guessLimit;

    public NumGame(int gl) {
        guesses = 0;
        coolest = 0;
        guessLimit = gl;
    }

    public void guessCoolerNum(Scanner sc) {
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        int cooler = NumberCoolness.coolerNum(num1, num2); //E
        if (cooler == 0) {
            System.out.println(num1 + " and " + num2 + " are equally cool.");
            addGuess(num1); //C
        } else {
            System.out.println("Between " + num1 + " and " + num2 + ", " + cooler + " is the Cooler Number.");
            addGuess(cooler); //C
        }

    }

    public void guessCoolestNearby(Scanner sc) {
        System.out.print("Enter the start number: ");
        int num = sc.nextInt();
        sc.nextLine();
        int cooler = NumberCoolness.coolestNearby(num); //E
        System.out.println("Out of all numbers between " + num + " and " + (num + 4) + ", " + cooler + " is the Coolest Number.");
        addGuess(cooler); //C
    }

    public static void gameOver() {
        System.out.println("Game over!");
        System.out.println("The coolest possible numbers:");
        System.out.println("Are between -30 and -80");
        System.out.println("Have a 7 in the ones place");
        System.out.println("And have an even 10s place!");
        System.out.println("Examples: -47, -67");
    }

    private void addGuess(int num) {
        if (NumberCoolness.coolerNum(coolest, num) == num) { //B //E
            System.out.println("This is the coolest number so far! Your guess count will remain at " + guesses + ".");
            coolest = num; //B
        } else {
            guesses++;
            System.out.println("This is not the coolest number, so your guesses will increase. You've now used " + guesses + " guesses.");
            if (isGameOver()) { //C
                gameOver(); //D
            }
        }
    }

    public boolean isGameOver() {
        if (guesses >= guessLimit) { //B
            return true;
        }
        return false;
    }
}
