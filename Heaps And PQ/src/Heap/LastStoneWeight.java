package Heap;
import java.util.*;

public class LastStoneWeight{
    public static int lastStoneWeight(int[] stones) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < stones.length; i++) {
            ans.add(stones[i]);
        }
        while(ans.size()>1){
            Collections.sort(ans);
            int x = ans.remove(ans.size()-1);
            int y = ans.remove(ans.size()-1);
            if(x != y){
                int diff = Math.abs(x-y);
                ans.add(diff);
            }
        }
        if(ans.isEmpty()) return 0;
        return ans.get(0);
    }
    public static void main(String[] args) {

    }
}
