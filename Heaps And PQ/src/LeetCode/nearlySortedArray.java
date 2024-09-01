package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class nearlySortedArray{
    static List<Integer> sortArray(int[] arr, int k){
        List<Integer> list = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int j=0; j<arr.length; j++){
            pq.add(j);
            if(pq.size()>k) list.add(pq.remove());
        }
        while(!pq.isEmpty()){
            list.add(pq.remove());
        }
        return list;
    }
    public static void main(String[] args) {
        int[] arr = {6,5,3,2,8,10,9};
        int k = 3;
        List<Integer> ans = sortArray(arr,k);
        System.out.println(ans);
    }
}
