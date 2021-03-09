package string;

import org.junit.Assert;
import org.junit.Test;

public class ReverseStringTest {
  @Test
  public void test() {
    ReverseString reverseString = new ReverseString();
    char[] input = new char[]{'h','e','l','l','o'};
    char[] output = new char[]{'o','l','l','e','h'};
    reverseString.reverseString(input);
    Assert.assertArrayEquals(input, output);
  }
}
