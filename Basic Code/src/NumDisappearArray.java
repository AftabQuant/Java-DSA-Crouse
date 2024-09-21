import java.util.*;
import java.util.ArrayList;

public class NumDisappearArray{
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        int[] freq = new int[n+1];
        for(int i=0; i<nums.length; i++){
            freq[nums[i]]++;
        }
        for(int i=0; i<freq.length; i++){
            if(freq[i] == 0) ans.add(i);
        }
        return ans;
    }
    public static void main(String[] args) {

    }
}
