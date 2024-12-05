package U5T7_Part2;

public class NumberCoolness {

    private NumberCoolness() {}

    public static int coolerNum(int num1, int num2) {
        if (findCoolness(num2) > findCoolness(num1)) { //A
            return num2;
        } else if (findCoolness(num1) > findCoolness(num2)) {
            return num1;
        }
        return 0;
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
        if (num == 0) {
            return 0;
        }
        int val = 5;
        if (num < 0) {
            val += 3;
        }
        num = Math.abs(num);
        if (num % 2 == 1) {
            val += 4;
        }
        if (num > 30 && num < 80)  {
            val += 2;
        }
        if (num % 10 == 7) {
            val += 5;
        }
        if ((num / 10) % 2 == 0) {
            val += 1;
        }
        return val;
    }
}
