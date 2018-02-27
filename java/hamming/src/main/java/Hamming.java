public class Hamming {

    public static int compute(String string1, String string2) {
        if (string1.length() != string2.length())
            throw new IllegalArgumentException("Both strings must be of equal length.");
        int count = 0;
        for (int i = 0; i < string1.length(); i++) {
            if (string1.charAt(i) != string2.charAt(i))
                count++;
        }
        return count;
    }
}
