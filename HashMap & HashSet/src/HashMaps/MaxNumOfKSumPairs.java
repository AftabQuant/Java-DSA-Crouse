package HashMaps;

import java.util.HashMap;

public class MaxNumOfKSumPairs{
    public static int maxOperations(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count=0;
        for(int ele: nums){
            int com = k - ele;
            if(map.containsKey(com)){
                count++;
                map.put(com,map.get(com)-1);
            }
            else map.put(com,map.get(com)+1);
        }
        return count;
    }
    public static void main(String[] args) {

    }
}
