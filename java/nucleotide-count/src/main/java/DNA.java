import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DNA {
    private final String strand;
    private static final Character[] NUCLEOTIDES = {'A', 'C', 'G', 'T'};

    public DNA(String strand) {
        this.strand = strand;
    }

    public int count(char nucleotide) {
        if (!Arrays.asList(NUCLEOTIDES).contains(nucleotide)) {
            throw new IllegalArgumentException("Nucleotide must be one of AGTC");
        }
        int count = 0;
        for(char character : strand.toCharArray()) {
            if (character == nucleotide) {
                count++;
            }
        }
        return count;
    }

    public Map<Character, Integer> nucleotideCounts() {
        HashMap<Character, Integer> counts = new HashMap<>();
        for (char nucleotide : NUCLEOTIDES) {
            counts.put(nucleotide, this.count(nucleotide));
        }
        return counts;
    }
}
