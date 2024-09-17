package Questions;

import java.util.*;
public class ConsistentString{
    public static int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> allowedSet = new HashSet<>();
        for (char c : allowed.toCharArray()) {
            allowedSet.add(c);
        }
        int count = 0;
        for (char c : allowed.toCharArray()) {
            if (allowedSet.contains(c)) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {

    }
}
