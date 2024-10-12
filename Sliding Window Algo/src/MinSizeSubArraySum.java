public class MinSizeSubArraySum{
    public static int minSubArrayLen(int target, int[] nums) {
        int n = nums.length, i = 0, j = 0, sum = 0;
        while(j <n && sum<target){
            sum += nums[j++];
        }
        j--;
        int minLength = Integer.MAX_VALUE;
        while(j<n){
            int len = j-i+1;
            if(sum >= target)  minLength = Math.min(minLength, len);
            sum -= nums[i];
            i++; j++;
            while(j<n && sum < target){
                sum +=nums[j++];
            }
            j--;
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }

    public static void main(String[] args) {

    }
}
