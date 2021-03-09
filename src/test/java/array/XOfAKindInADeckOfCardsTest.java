package array;

import org.junit.Assert;
import org.junit.Test;

public class XOfAKindInADeckOfCardsTest {
  @Test
  public void test() {
    XOfAKindInADeckOfCards xOfAKindInADeckOfCards = new XOfAKindInADeckOfCards();
    int[] input = new int[]{1, 2, 3, 4, 4, 3, 2, 1};
    boolean expected = true;
    boolean output = xOfAKindInADeckOfCards.hasGroupsSizeX(input);
    Assert.assertEquals(expected, output);

    input = new int[]{1, 1, 1, 2, 2, 2, 3, 3};
    expected = false;
    output = xOfAKindInADeckOfCards.hasGroupsSizeX(input);
    Assert.assertEquals(expected, output);

    input = new int[]{1};
    expected = false;
    output = xOfAKindInADeckOfCards.hasGroupsSizeX(input);
    Assert.assertEquals(expected, output);

    input = new int[]{1, 1};
    expected = true;
    output = xOfAKindInADeckOfCards.hasGroupsSizeX(input);
    Assert.assertEquals(expected, output);

    input = new int[]{1, 1, 2, 2, 2, 2};
    expected = true;
    output = xOfAKindInADeckOfCards.hasGroupsSizeX(input);
    Assert.assertEquals(expected, output);

    input = new int[]{1, 1, 1, 1, 2, 2, 2, 2, 2, 2};
    expected = true;
    output = xOfAKindInADeckOfCards.hasGroupsSizeX(input);
    Assert.assertEquals(expected, output);
  }
}
