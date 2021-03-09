package string;

import org.junit.Assert;
import org.junit.Test;

public class ReverseWordsInAStringIiiTest {
  @Test
  public void test() {
    ReverseWordsInAStringIii reverseWordsInAStringIii = new ReverseWordsInAStringIii();
    String input = "Let's take LeetCode contest";
    String expected = reverseWordsInAStringIii.reverseWords(input);
    String output = "s'teL ekat edoCteeL tsetnoc";
    Assert.assertEquals(expected, output);
  }
}
