public class ProductLessThanK{
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length;
        int i=0, j=0, prod = 1, count = 0;
        for(j = 0; j < n; j++) {
            prod *= nums[j];
            while (prod >= k && i<=j){
                prod /= nums[i++];
            }
            count += (j - i + 1);
        }
        return count;
    }
    public static void main(String[] args) {

    }
}
