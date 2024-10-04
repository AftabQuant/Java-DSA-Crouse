public class PivotIndex{
    public static int pivotIndex(int[] nums) {
        int n = nums.length;
        for(int i=1; i<nums.length; i++){
            nums[i] += nums[i-1];
        }
        for(int i=0; i<nums.length; i++){
            int leftSum = 0; int rightSum = 0;
            if(i > 0) leftSum = nums[i-1];
            rightSum = nums[n-1] - nums[i];
            if(leftSum == rightSum) return i;
        }
        return -1;
    }
    public static void main(String[] args) {

    }
}
