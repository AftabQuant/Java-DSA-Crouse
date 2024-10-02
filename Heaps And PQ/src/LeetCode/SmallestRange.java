package LeetCode;
import java.util.*;

class Triplets implements Comparable<Triplets>{
    int ele;
    int row;
     int col;
     Triplets(int ele, int row, int col){
         this.ele = ele;
         this.row = row;
         this.col = col;
     }
    public int compareTo(Triplets s){
        return  this.ele - s.ele;
}
public static class SmallestRange{
    public static int[] smallestRange(List<List<Integer>> nums) {
        int[] res = {0, Integer.MAX_VALUE};
        PriorityQueue<Triplets> pq = new PriorityQueue<>();
        int k = nums.size();
        int max = Integer.MIN_VALUE;
        for(int i=0; i<k; i++){
            int num = nums.get(i).get(0);
            pq.add(new Triplets(num, i, 0));
            max = Math.max(max, num);
        }
        while(true){
            Triplets top = pq.remove();
            int ele = top.ele; int row = top.row; int col = top.col;
            if(max-ele < res[1] - res[0]){
                res[0] = ele;
                res[1] = max;
            }
            if(col == nums.get(row).size()-1) break;
            int next = nums.get(row).get(col+1);
            max = Math.max(max,next);
            pq.add(new Triplets(next, row, col+1));
        }
         return res;
        }
    }
    public static void main(String[] args) {

    }
}
