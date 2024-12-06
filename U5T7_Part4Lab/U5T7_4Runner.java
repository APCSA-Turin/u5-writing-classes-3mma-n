package U5T7_Part4Lab;

public class U5T7_4Runner {
    public static void main(String[] args) {
        boolean test1 = Words.doesContain("ell", "hello");
        boolean test2 = Words.doesContain("ell", "hyper");
        boolean test3 = Words.doesContain("ell", "i want to sell");
        boolean test4 = Words.doesContain("happy", "happ");
        boolean test5 = Words.doesContain("happy", "happy");
        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test3);
        System.out.println(test4);
        System.out.println(test5);
        Words.printReverse("hello");
        Words.printReverse("final it's friday!");
    }
}
