package Semester;
import java.util.*;

public class IndicesAfterSorting{
    public static List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> ans = new ArrayList<>();
        int lo=0; int hi=nums.length-1;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==target) ans.add(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] num = {1,2,5,2,3}; int target = 2;
        List<Integer> ans = targetIndices(num,target);
        System.out.println(ans);
    }
}
