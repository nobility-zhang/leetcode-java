package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

// #17
public class LetterCombinationsOfAPhoneNumber {
  public List<String> letterCombinations(String digits) {
    if ("".equals(digits)) {
      return new ArrayList<>();
    }
    String[] numbers = digits.split("");
    List<List<String>> letters = numberToLetter(numbers);
    if (letters.size() == 1){
      return letters.get(0);
    }
    while (true) {
      if (letters.size() >= 2) {
        List<String> combination = combination(letters.get(0), letters.get(1));
        letters.set(0, combination);
        letters.remove(1);
      } else {
        return letters.get(0);
      }
    }
  }

  private List<List<String>> numberToLetter(String[] numbers) {
    HashMap<String, String> map = new HashMap<>();
    map.put("2", "abc");
    map.put("3", "def");
    map.put("4", "ghi");
    map.put("5", "jkl");
    map.put("6", "mno");
    map.put("7", "pqrs");
    map.put("8", "tuv");
    map.put("9", "wxyz");
    ArrayList<List<String>> letters = new ArrayList<>();
    for (String number : numbers) {
      letters.add(Arrays.asList(map.get(number).split("")));
    }
    return letters;
  }

  private List<String> combination(List<String> list1, List<String> list2) {
    ArrayList<String> combinations = new ArrayList<>();
    for (int i = 0; i < list1.size(); i++) {
      for (int j = 0; j < list2.size(); j++) {
        combinations.add(list1.get(i) + list2.get(j));
      }
    }
    return combinations;
  }
}
