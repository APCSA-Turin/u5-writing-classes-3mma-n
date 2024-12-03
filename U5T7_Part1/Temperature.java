public class Temperature {
    private double high;
    private double low;
    private String scale;

    public Temperature(double h, double l, String s) {
        high = h;
        low = l;
        if (s.equals("C")) {
            scale = "C";
        } else {
            scale = "F";
        }
    }

    public static double convertCtoF(double c) {
        return c * 9 / 5 + 32;
    }

    public static double convertFtoC(double f) {
        return (f - 32) * 5 / 9;
    }

    public void changeToC() {
        if (scale.equals("F")) {
            high = convertFtoC(high);
            low = convertFtoC(low);
            scale = "C";
        }
    }

    public void changeToF() {
        if (scale.equals("C")) {
            high = convertCtoF(high);
            low = convertCtoF(low);
            scale = "F";
        }
    }

    public String tempInfo() {
        String str = "High Temperature: " + high + " " + scale;
        str += "\nLow Temperature: " + low + " " + scale;
        return str;
    }
}

