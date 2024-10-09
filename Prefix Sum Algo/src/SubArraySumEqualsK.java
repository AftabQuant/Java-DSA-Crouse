import java.util.*;

public class SubArraySumEqualsK{
    public static int subArraySum(int[] nums, int k) {
        int count = 0;
        for(int i=0; i<nums.length; i++){
            for(int j= i; j<nums.length; j++){
                int sum = 0;
                sum += nums[j];
                if(sum == k) count++;
            }
        }
        return count;
    }
    public static int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=1; i<nums.length; i++) nums[i] += nums[i-1];
        int count = 0;
        for (int top : nums) {
            if(top == k) count++;
            int rem = top - k;
            if (map.containsKey(rem)) count += map.get(rem);
            if(map.containsKey(top)) map.put(top, map.get(top)+1);
            else {
                map.put(top, 1);
            }
        }
        return count;
    }
    public static void main(String[] args) {

    }
}
