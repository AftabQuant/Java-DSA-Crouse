package LeetCode;
import java.util.Arrays;

class Solution {
    public int thirdMax(int[] nums) {

        Arrays.sort(nums);
        int i;
        int count=1;
        for(i=nums.length-1;i>0;i--){
            if(nums[i]!=nums[i-1]){
                count++;
            }
            if(count==3){
                return nums[i-1];
            }
        }
        return nums[nums.length-1];
    }
}
public class ThirdMaximumValue{
    public static void main(String[] args) {

    }
}
