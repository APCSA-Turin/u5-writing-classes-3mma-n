public class HiddenWord {
    private String word;
  
    public HiddenWord(String input) {
      word = input;
    }
  
    public String getHint(String guess) {
      String output = "";
      for (int i = 0; i < word.length(); i++) {
        if (guess.substring(i, i+1).equals(word.substring(i, i+1))) {
          output += guess.substring(i, i+1);
        } else if (word.indexOf(guess.substring(i, i+1)) >= 0) {
          output += "+";
        } else {
          output += "*";
        }
      }
      return output;
    }
  }  