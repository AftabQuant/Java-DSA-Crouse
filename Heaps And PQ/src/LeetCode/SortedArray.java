package LeetCode;

import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;

public class SortedArray{
    public static int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int key: nums){
            if(map.containsKey(key)){
                map.put(key, map.get(key)+1);
            }
            else{
                map.put(key, 1);
            }
        }
        PriorityQueue<Pairs> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int key: map.keySet()){
            Pairs p = new Pairs(key,map.get(key));
            pq.add(p);
        }
        int[] ans = new int[nums.length];
        while(!pq.isEmpty()){
            Pairs p = pq.remove();
            int freq = p.freq;
            int val = p.key;
            for(int i=0; i<freq; i++){
                ans[i] = val;
            }
        }
        return ans;
    }
    public static void main(String[] args) {

    }
}
