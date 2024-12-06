package U5T7_Part4Lab;

public class Nums {
    // static variables
    private static int totalGenerated = 0;
    // instance variables
    private int num1;
    private int num2;
    private int numsGenerated;

    public Nums(int i1, int i2) {
        num1 = i1;
        num2 = i2;
        numsGenerated = 0;
    }

    public int randBetween() {
        numsGenerated++;
        totalGenerated++;
        return (int) (Math.random() * (num2 - num1 + 1)) + num1;
    }

    public int getRandomNumsGenerated() {
        return numsGenerated;
    }

    public static int getTotalRandomNumsGenerated() {
        return totalGenerated;
    }
}
