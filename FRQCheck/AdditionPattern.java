public class AdditionPattern {
    private int firstNum;
    private int number;
    private int change;
  
    public AdditionPattern(int start, int addedNum) {
      firstNum = start;
      change = addedNum;
      number = firstNum;
    }
  
    public int currentNumber() {
      return number;
    }
  
    public void next() {
      number += change;
    }
  
    public void prev() {
      if (number - change >= firstNum) {
        number -= change;
      }
    }
  }
  