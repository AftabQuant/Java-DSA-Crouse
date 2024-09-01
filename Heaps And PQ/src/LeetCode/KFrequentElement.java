package LeetCode;

import java.util.HashMap;
import java.util.PriorityQueue;

class Pairs implements Comparable<Pairs>{
    int key;
    int freq;
    Pairs(int key, int freq){
        this.key = key;
        this.freq = freq;
    }
    public int compareTo(Pairs p){
        if(this.freq == p.freq) return p.key-this.key;
        return this.freq-p.freq;
    }
}
public class KFrequentElement{
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Pairs> pq = new PriorityQueue<>();
        for(int ele: nums){
            if(map.containsKey(ele)) map.put(ele,map.get(ele)+1);
            else map.put(ele, 1);
        }
        for(int key: map.keySet()){
            Pairs val = new Pairs(key,map.get(key));
            pq.add(val);
            if(pq.size()>k) pq.remove();
        }
        for(int i=0; i<pq.size(); i++){
            Pairs p = pq.remove();
            int val = p.key;
            ans[i] = val;
        }
        return ans;
    }
    public static void main(String[] args) {

    }
}
