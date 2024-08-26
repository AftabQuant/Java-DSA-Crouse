package HashMaps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class UniqueLengthSubsequences{
    public static int countPalindromicSubsequence(String s) {
        HashMap<Character, Integer> FirstMap = new HashMap<>();
        HashMap<Character, Integer> LastMap = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            if(!FirstMap.containsKey(s.charAt(i))) FirstMap.put(s.charAt(i),i);
            LastMap.put(s.charAt(i),i);
        }
        int count = 0;
        for(char ch : FirstMap.keySet()){
            int Fidx = FirstMap.get(ch);
            int Lidx = LastMap.get(ch);
            Set<Character> set = new HashSet<>();
            for(int i=Fidx+1; i<Lidx; i++){
                set.add(s.charAt(i));
            }
            count +=set.size();
        }
        return count;
    }
    public static void main(String[] args) {

    }
}
