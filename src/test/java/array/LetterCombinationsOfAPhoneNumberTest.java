package array;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class LetterCombinationsOfAPhoneNumberTest {
  @Test
  public void test() {
    LetterCombinationsOfAPhoneNumber letterCombinationsOfAPhoneNumber = new LetterCombinationsOfAPhoneNumber();
    String input = "23";
    List<String> output = letterCombinationsOfAPhoneNumber.letterCombinations(input);
    List<String> expected = Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf");
    Assert.assertEquals(expected, output);

    input = "2";
    output = letterCombinationsOfAPhoneNumber.letterCombinations(input);
    expected = Arrays.asList("a","b","c");
    Assert.assertEquals(expected, output);

    input = "";
    output = letterCombinationsOfAPhoneNumber.letterCombinations(input);
    expected = Arrays.asList();
    Assert.assertEquals(expected, output);
  }
}
