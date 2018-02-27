import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pangrams {
    private static final int ALPHABET_COUNT = 26;
    private static final String ALPHABET_REGEX = "([a-z])(?!.*\\1)"; // https://regex101.com/r/qV4nH4/1

    public static boolean isPangram(String phrase) {
        String sanitizedPhrase = phrase.toLowerCase().replaceAll("\\p{javaWhitespace}", "");
        Pattern alphabetPattern = Pattern.compile(ALPHABET_REGEX);
        Matcher alphabetMatcher = alphabetPattern.matcher(sanitizedPhrase);
        int count = 0;
        while (alphabetMatcher.find())
            count++;
        return count == ALPHABET_COUNT;
    }
}
