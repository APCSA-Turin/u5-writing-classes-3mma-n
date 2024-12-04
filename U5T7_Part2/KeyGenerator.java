package U5T7_Part2;

public class KeyGenerator {
    private Key key;

    public KeyGenerator(String seed) {
        key = new Key(shift(seed));
    }
 
    public Key getKey() {
        return key;
    }
 
    private String shift(String s) {
        return s.substring(1) + s.substring(0, 1);
    }
}
