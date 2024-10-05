import java.util.Arrays;
import java.util.Map;

public class LongestSubSequence{
    public static int binarySearch(int[] arr, int ele){
        int lo = 0; int hi = arr.length-1;
        int max = 0;
        while(lo<= hi){
            int mid = lo + (hi - lo)/2;
            if(arr[mid] <= ele){
                max = Math.max(max, mid + 1);
                lo = mid + 1;
            }
            else if(arr[mid]> ele){
                hi = mid-1;
            }
        }
        return max;
    }
    public static int[] answerQueries(int[] nums, int[] queries) {
        int m = queries.length;
        int[] res = new int[m];
        Arrays.sort(nums);
        for(int i=1; i<nums.length; i++){
            nums[i] +=nums[i-1];
        }
        for(int i=0; i<m; i++){
            res[i] = binarySearch(nums, queries[i]);
        }
        return res;
    }

    public static void main(String[] args) {

    }
}
