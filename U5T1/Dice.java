public class Dice {
    private int sides;
    private int lastRoll;
    private int rolls;

    public Dice(int sides) {
        this.sides = sides;
        lastRoll = 0;
        rolls = 0;
    }

    public int getSides() {
        return sides;
    }

    public int getLastRoll() {
        return lastRoll;
    }

    public int getRolls() {
        return rolls;
    }

    public void setSides(int newSides) {
        sides = newSides;
    }

    public void roll() {
        lastRoll = (int) (Math.random() * sides) + 1;
        rolls++;
    }
}