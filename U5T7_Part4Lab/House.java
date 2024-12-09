package U5T7_Part4Lab;

public class House {
    // static variables
    private static int totalHouses = 0;
    private static House biggestHouse = null;
    private static int lastAddress = 99;
    private static String streetName = "Fort Greene Place";

    //instance variables
    private int floors;
    private int address;
    private String ownerName;

    public House(String n, int f) {
        ownerName = n;
        floors = f;
        address = lastAddress + 2;
        lastAddress += 2;
        totalHouses++;
        if (totalHouses == 1 || this.floors > biggestHouse.floors) {
            biggestHouse = this;
        }
    }

    public static int getTotalHouses() {
        return totalHouses;
    }

    public static House getBiggestHouse() {
        return biggestHouse;
    }
    public static void classInfo() {
        System.out.println("Info for houses on " + streetName + ":");
        System.out.println("Total # of Houses Built: " + totalHouses);
        System.out.println("The Biggest House has " + biggestHouse.floors + " floors and is owned by " + biggestHouse.ownerName + ".");
    }

    public void changeOwnership(String newOwner) {
        System.out.println("Ownership of " + ownerName + "'s house has been transfered to " + newOwner + ".");
        ownerName = newOwner;
    }

    public void printInfo() {
        System.out.println("This house has " + floors + " floors and is owned by " + ownerName + ".");
        System.out.println("Its address is " + address + " " + streetName + ".");
    }
}
