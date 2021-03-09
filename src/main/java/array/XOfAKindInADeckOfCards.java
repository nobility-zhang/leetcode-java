package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// #914
public class XOfAKindInADeckOfCards {
  public boolean hasGroupsSizeX(int[] deck) {
    if (deck.length < 2) {
      return false;
    }
    List<List<Integer>> group = group(deck);
    List<Integer> lens = new ArrayList<>();
    for (int i = 0; i < group.size(); i++) {
      lens.add(group.get(i).size());
    }
    int min = gcdRecursion(lens);
    if (min == 1) {
      return false;
    }
    for (int i = 0; i < lens.size(); i++) {
      if (lens.get(i) % min != 0) {
        return false;
      }
    }
    return true;
  }

  private List<List<Integer>> group(int[] deck) {
    Arrays.sort(deck);
    List<Integer> temp = new ArrayList<>();
    List<List<Integer>> dst = new ArrayList<>();
    for (int i = 0; i < deck.length; i++) {
      temp.add(deck[i]);
      for (int j = i + 1; j < deck.length + 1; j++) {
        if (j < deck.length && deck[i] == deck[j]) {
          temp.add(deck[j]);
        } else {
          dst.add(new ArrayList<>(temp));
          temp.clear();
          i = j - 1;
          break;
        }
      }
    }
    return dst;
  }

  private Integer gcd(Integer num1, Integer num2) {
    return num2 == 0 ? num1 : gcd(num2, num1 % num2);
  }

  private Integer gcdRecursion(List<Integer> arr) {
    if (arr.size() == 0) {
      return null;
    }
    while (true) {
      if (arr.size() == 1) {
        return arr.get(0);
      }
      int a = arr.remove(0);
      int b = arr.remove(0);
      int v = gcd(a, b);
      if (v == 1) {
        return 1;
      } else {
        arr.add(0, v);
      }
    }
  }
}
