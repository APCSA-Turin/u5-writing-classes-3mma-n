package U5T7_Part4Lab;

public class Words {

    private Words() {}
    
    public static boolean doesContain(String sub, String str) {
        if (str.indexOf(sub) >= 0) {
            return true;
        }
        return false;
    }

    public static void printReverse(String str) {
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.substring(i, i+1) + " ");
        }
        System.out.println();
    }
}
