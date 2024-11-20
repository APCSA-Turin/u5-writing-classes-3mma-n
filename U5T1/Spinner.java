public class Spinner {
    private int sections;
    private int lastSpin;
    private int spins;
    private int spinTotal;

    public Spinner(int sections) {
        this.sections = sections;
        lastSpin = 0;
        spins = 0;
    }

    public int getSpinValue() {
        return lastSpin;
    }

    public int getSpinCount() {
        return spins;
    }

    public int getSpinSum() {
        return spinTotal;
    }

    public double averageSpin() {
        return (double) spinTotal / spins;
    }

    public void spin() {
        lastSpin = (int) (Math.random() * sections) + 1;
        spinTotal += lastSpin;
        spins++;
    }
}
