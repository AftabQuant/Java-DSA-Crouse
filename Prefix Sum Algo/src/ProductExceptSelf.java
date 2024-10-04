public class ProductExceptSelf{
//    public static int[] productExceptSelf(int[] nums){
//        int[] ans = new int[nums.length];
//        for(int i=0; i<nums.length; i++){
//            int leftPro = 1; int rightPro = 1;
//            for(int j=0; j<i-1; j++){
//                leftPro *= nums[i];
//            }
//            for(int j= i+1; j<nums.length; j++){
//                rightPro *= nums[i];
//            }
//            ans[i] = leftPro * rightPro;
//        }
//        return ans;
//    }
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        prefix[0] = 1;
        for(int i=1; i<n; i++){
            prefix[i] = prefix[i-1] * nums[i-1];
        }
        suffix[n-1] = 1;
        for(int i=n-2; i>= 0; i--){
            suffix[i] = suffix[i+1] * nums[i+1];
        }
        for(int i=0; i<n; i++){
            nums[i] = prefix[i] * suffix[i];
        }
        return nums;
    }
    public static void main(String[] args) {
        
    }
}
