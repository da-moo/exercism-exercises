import java.util.HashMap;
import java.util.Map;

public class WordCount {

    public Map<String, Integer> phrase(String phrase) {
        String[] sanitizedPhrase = phrase.replaceAll("[^ \\w+]", "").toLowerCase().split("\\s+");
        HashMap<String, Integer> retVal = new HashMap<>();
        for(String word : sanitizedPhrase) {
            if(retVal.containsKey(word)) {
                retVal.put(word, retVal.get(word) + 1);
            } else {
                retVal.put(word, 1);
            }
        }
        return retVal;
    }
}
