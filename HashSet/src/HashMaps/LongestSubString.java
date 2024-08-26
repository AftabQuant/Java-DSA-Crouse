package HashMaps;
import java.util.HashMap;

public class LongestSubString{
    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int i=0; int j=0; int maxLen = 0;
        while(j<s.length()){
            char ch = s.charAt(j);
            if(map.containsKey(ch) && map.get(ch)>=i){
                int len = j-i;
                maxLen = Math.max(len,maxLen);
                while(s.charAt(i)!=ch) i++;
                i++;
            }
            map.put(s.charAt(j),j);
            j++;
        }
        int len = j-i;
        maxLen = Math.max(len,maxLen);
        return maxLen;
    }
    public static void main(String[] args){
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
