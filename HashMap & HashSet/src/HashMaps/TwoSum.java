package HashMaps;

import java.util.HashMap;

public class TwoSum{
    public static int[] twoSum(int[] nums, int target){
        int[] ans = {-1, -1};
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int remaining = target-nums[i];
            if(map.containsKey(remaining)){
                int j = map.get(remaining);
                ans[0] = i;
                ans[1] = j;
                return ans;
            }
            else map.put(nums[i],i);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};   int target = 9;
        int[] ans = twoSum(nums,target);
        for(int ele: ans){
            System.out.print(ele+", ");
        }
    }
}
