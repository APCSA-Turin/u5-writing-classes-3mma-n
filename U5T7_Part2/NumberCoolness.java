package U5T7_Part2;

public class NumberCoolness {

    private NumberCoolness() {}

    public static int coolerNum(int num1, int num2) {
        if (findCoolness(num2) > findCoolness(num1)) { //A
            return num2;
        }
        return num1;
    }

    public static int coolestNearby(int start) {
        int current = start;
        int coolness = 0;
        for (int i = 0; i < 5; i++) {
            if (findCoolness(start + i) > coolness) { //A
                coolness = findCoolness(start + i);
                current = start + i;
            }
        }
        return current;
    }

    private static int findCoolness(int num) {
        int val = 5;
        if (num < 0) {
            val += 3;
        }
        if (num % 2 == 1) {
            val += 4;
        }
        if (Math.abs(num) > 30 && Math.abs(num) < 80)  {
            val += 2;
        }
        if (num % 7 == 0) {
            val += 5;
        }
        if ((val / 10) % 2 == 0) {
            val += 1;
        }
        return val;
    }
}
