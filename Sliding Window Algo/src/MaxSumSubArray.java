public class MaxSumSubArray{
    private static int maxSum(int[] arr, int k){
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n-k+1; i++){
            int sum = 0;
            for(int j=i; j<i+k; j++){
                sum +=arr[j];
            }
            max = Math.max(max,sum);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 1, 3, -40, 80, 10};
        System.out.println(maxSum(arr,3));
    }
}
