package U5T7_Part4Lab;

public class U5T7_4Runner {
    public static void main(String[] args) {
        System.out.println("The total # of Houses is: " + House.getTotalHouses());
        System.out.println();

        System.out.println("Building 2 houses...");
        House house1 = new House("Jeremy", 2);
        House house2 = new House("Amelia", 5);
        house1.printInfo();
        house2.printInfo();
        System.out.println();

        House.classInfo();
        System.out.println();

        System.out.println("Building another house...");
        House house3 = new House("Emily", 1);
        house3.printInfo();
        System.out.println();

        House.classInfo();
        System.out.println();

        house2.changeOwnership("Avery");
        House.classInfo();
    }
}
