package U5T7_Part2;
import java.util.Scanner;
public class NumGame {
    private int upShift;
    private boolean reverse;
    private int guesses;

    public NumGame(int rs) {
        upShift = (int) (Math.random() * 101) - 50;
        if (Math.random() < 0.5) {
            reverse = true;
        } else {
            reverse = false;
        }
    }

    public void coolerNum(Scanner sc) {
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        int cooler = NumberCoolness.coolerNum(shiftVal(num1), shiftVal(num2));
        System.out.println("Between " + num1 + " and " + num2 + ", " + cooler + " is the Cooler Number.")
    }

    public void coolestNearby(Scanner sc) {
        System.out.print("Enter the start number: ");
        int num = sc.nextInt();
        sc.nextLine();
        int cooler = NumberCoolness.coolestNearby(shift);
        System.out.println("Between " + num1 + " and " + num2 + ", " + cooler + " is the Cooler Number.")
    }

    // public int userGuess(Scanner sc) {
    //     System.out.println("Choose your preferred action:");
    //     System.out.println("1. Compare Coolness of 2 Numbers");
    //     System.out.println("2. Know the Coolest within the 5 Numbers above a Number.");
    //     int ans = sc.nextInt();

    //     return 0;
    // }

    private int shiftVal(int num) {
        if (reverse) {
            return (num + upShift) * -1;
        }
        return num + upShift;
    }

}
