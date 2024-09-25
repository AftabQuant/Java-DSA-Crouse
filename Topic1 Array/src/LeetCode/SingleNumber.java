package LeetCode;

import java.util.HashMap;

public class SingleNumber{
    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int ele: nums){
            if(map.containsKey(ele)) map.put(ele, map.get(ele)+1);
            else map.put(ele,1);
        }
        for(int key: map.keySet()){
            if(map.get(key) == 1) return key;
        }
        return -1;
    }
    public static void main(String[] args) {

    }
}
