package LeetCode;
import java.util.*;

public class MinCostOfRope{
    public long minCost(long[] arr) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for(long ele: arr){
            pq.add(ele);
        }
        long cost = 0;
        while(pq.size()>1){
            long x = pq.remove();
            long y = pq.remove();
            cost += (x+y);
            pq.add(x+y);
        }
        return pq.remove();
    }
    public static void main(String[] args) {

    }
}
