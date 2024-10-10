public class MaxSumSubArray{
    private static int bruteForce(int[] arr, int k){
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
    private static int slidingWindow(int[] arr, int k){
        int i=0, j=k-1, sum=0;
        for(int a=0; a<k; a++){
            sum += arr[a];
        }
        i++; j++;
        int max = Integer.MIN_VALUE;
        while(j< arr.length){
            sum = sum - arr[i-1] + arr[j];
            max = Math.max(sum, max);
            i++; j++;
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 1, 3, -40, 80, 10};
        System.out.println(bruteForce(arr,3));
        System.out.println(slidingWindow(arr,3));
    }
}
