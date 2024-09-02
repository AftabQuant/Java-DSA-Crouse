package LeetCode;
import java.util.*;

public class RelativeRank{
    public static String[] findRelativeRanks(int[] score) {
        String[] ans = new String[score.length];
        int[] temp = Arrays.copyOf(score, score.length);
        Arrays.sort(temp);
        HashMap<Integer, String > map = new HashMap<>();
        for(int i=0; i<temp.length; i++){
            if(i == temp.length-1)  map.put(temp[i], "Gold Medal");
            else if(i == temp.length-2) map.put(temp[i], "Silver Medal");
            else if(i == temp.length-3) map.put(temp[i], "Bronze Medal");
            else map.put(temp[i],Integer.toString(temp.length - i));
        }
        for (int i = 0; i < score.length; i++) {
            ans[i] = map.get(score[i]);
        }
        return ans;
    }
    public static void main(String[] args) {

    }
}
