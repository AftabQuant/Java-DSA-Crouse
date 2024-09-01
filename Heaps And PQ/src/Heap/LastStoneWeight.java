package Heap;
import java.util.*;

public class LastStoneWeight{
    public static int lastStoneWeightUsingAL(int[] stones) {
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
    public int lastStoneWeight(int[] stones){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int ele: stones){
            pq.add(ele);
        }
        while(pq.size()>1){
            int x = pq.remove();
            int y = pq.remove();
            pq.add(x-y);
        }
        return pq.remove();
    }
    public static void main(String[] args) {

    }
}
