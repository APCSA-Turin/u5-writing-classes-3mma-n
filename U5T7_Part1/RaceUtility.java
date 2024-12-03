public class RaceUtility {

    private RaceUtility() {}

    public static double milesToKm(double mi) {
        return mi * 1.609;
    }

    public static double kmToMiles(double km) {
        return km * 0.621;
    }

    public static String makeProper(String str) {
        boolean isFirst = true;
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            String currentChar = str.substring(i, i + 1);
            if (isFirst) {
                isFirst = false;
                currentChar = currentChar.toUpperCase();
            } else {
                currentChar = currentChar.toLowerCase();
            }
            newStr += currentChar;
            if (currentChar.equals(" ")) {
                isFirst = true;
            }
        }
        return newStr;
    }
}
