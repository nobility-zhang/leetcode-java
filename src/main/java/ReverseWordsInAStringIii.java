import java.util.Arrays;
import java.util.stream.Collectors;

// #557
public class ReverseWordsInAStringIii {
  public String reverseWords(String s) {
    return Arrays.stream(s.split(" "))
        .map(word ->
            new StringBuilder(word)
            .reverse()
            .toString())
        .collect(Collectors.joining(" "));
  }
}
