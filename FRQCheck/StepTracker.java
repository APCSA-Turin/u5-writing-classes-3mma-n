public class StepTracker {
    private int stepsCounted;
    private int daysActive;
    private int daysTracked;
    private int stepMin;
  
    public StepTracker(int min) {
      stepMin = min;
      stepsCounted = 0;
      daysActive = 0;
      daysTracked = 0;
    }
  
    public void addDailySteps(int amount) {
      stepsCounted += amount;
      daysTracked++;
      if (amount >= stepMin) {
        daysActive++;
      }
    }
  
    public int activeDays() {
      return daysActive;
    }
  
public double averageSteps() {
    if (daysTracked != 0) {
    return (double) stepsCounted / daysTracked;
    }
    return 0;
}
  }
  