public class MaxConsecutiveOnes{
    public static int findMaxConsecutiveOnes(int[] nums){
        int n = nums.length; int max = Integer.MIN_VALUE; int count = 0;
        for(int i=0; i<n; i++){
            if(nums[i] == 1){
                count++;
                max = Math.max(count,max);
            }
            else{
                count = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {

    }
}
