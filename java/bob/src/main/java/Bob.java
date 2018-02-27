import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bob {
    private static final Pattern YELL_PATTERN = Pattern.compile("\\b\\p{javaUpperCase}{4,}!*|\\b\\p{javaUpperCase}+!+");
    private static final Pattern QUESTION_PATTERN = Pattern.compile("\\?+\\z");
    private static final String YELL_RESPONSE = "Whoa, chill out!";
    private static final String QUESTION_RESPONSE = "Sure.";
    private static final String EMPTY_RESPONSE = "Fine. Be that way!";
    private static final String STANDARD_RESPONSE = "Whatever.";

    public String hey(String statement) {
        Matcher yellMatcher = YELL_PATTERN.matcher(statement);
        Matcher questionMatcher = QUESTION_PATTERN.matcher(statement);
        if (yellMatcher.find()) {
            return YELL_RESPONSE;
        } else if (questionMatcher.find()) {
            return QUESTION_RESPONSE;
        } else if (statement.matches("\\s*")) {
            return EMPTY_RESPONSE;
        } else {
            return STANDARD_RESPONSE;
        }
    }
}
