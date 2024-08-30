package Heap;
import java.util.*;

public class KclosestElements{
    static class Pair  implements Comparable<Pair>{
        int num;
        int diff;
        Pair(int num, int diff){
            this.num = num;
            this.diff = diff;
        }
        public int compareTo(Pair p){
            if(this.diff==p.diff) return this.num - p.num;
            return this.diff-p.diff;
        }
    }
    static List<Integer> findClosestElements(int[] arr, int k, int x){
        PriorityQueue<Pair> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int j : arr) {
            int diff = Math.abs(x - j);
            pq.add(new Pair(j, diff));
            if (pq.size() > k) pq.remove();
        }
        List<Integer> ans = new ArrayList<>();
        while(pq.size()>0){
            Pair ele = pq.remove();
            ans.add(ele.num);
        }
        Collections.sort(ans);
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k=4; int x = 3;
        List<Integer> ans = findClosestElements(arr,k,x);
        System.out.println(ans);
    }
}
