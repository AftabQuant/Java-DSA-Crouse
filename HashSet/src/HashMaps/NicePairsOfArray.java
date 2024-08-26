package HashMaps;

import java.util.HashMap;

public class NicePairsOfArray{
    public static int rev(int num){
        int rse=0;
        while(num>0){
            rse = rse*10 + num%10;
            num /=10;
        }
        return rse;
    }
    // Brute Force Method ---->
    public static int countNicePairs2(int[] nums){
        int count=0;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                int val1 = nums[i]+rev(nums[j]);
                int val2 = rev(nums[i])+nums[j];
                if(val1==val2) count++;
            }
        }
        return count;
    }
    public static int countNicePairs(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        int count=0;
        for(int ele: nums){
            int rem = ele - rev(ele);
            if(map.containsKey(rem)){
                int freq = map.get(rem);
                count +=freq; // Important
                count %= 1000000007; // Important Point For Base Case
                map.put(ele,freq+1);
            }
            else map.put(rem,1);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {42,11,1,97};
        System.out.println(countNicePairs(arr));
    }
}
