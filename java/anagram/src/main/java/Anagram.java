import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Anagram {
    private final String word;
    private final char[] wordAsCharArray;

    public Anagram(String word) {
        this.word = word;
        this.wordAsCharArray = word.toLowerCase().toCharArray();
        Arrays.sort(wordAsCharArray);
    }

    public List<String> match(List<String> words) {
        return words.stream()
                .filter(w -> (w.length() == word.length()) && !w.equalsIgnoreCase(word))
                .filter(w -> {
                    char[] wordToBeTested = w.toLowerCase().toCharArray();
                    Arrays.sort(wordToBeTested);
                    return Arrays.equals(wordAsCharArray, wordToBeTested);
                }).collect(toList());
    }
}
