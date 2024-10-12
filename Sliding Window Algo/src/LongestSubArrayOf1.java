import java.util.Arrays;

public class LongestSubArrayOf1{
    public static int longestSubarray(int[] nums) {
        int n = nums.length; int x = 0;
        for(int ele : nums){
            if(ele == 0) x++;
        }
        if(x == 0) return n-1;
        int i=0, j=0, maxLen = 0, zeroes = 0;
        while(i<n && nums[i] == 0) i++;
        if(i == n) return 0;
        j = i;
        while(j<n){
             if(nums[j] == 1){
                 j++;
             }
             else{
                 if(zeroes == 0){
                     zeroes++;
                     j++;
                 }
                 else{
                     int len = j -i +1;
                     maxLen = Math.max(len, maxLen);
                     j++;
                     while(i <n && nums[i] == 1) i++;
                     i++;
                 }
             }
        }
        if(zeroes == 0) return n-1;
        int len = j -i +1;
        maxLen = Math.max(len, maxLen);
        return maxLen;
    }
    public static void main(String[] args) {

    }
}
