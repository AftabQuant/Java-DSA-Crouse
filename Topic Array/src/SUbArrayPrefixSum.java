import java.util.*;
public class SUbArrayPrefixSum {
    static int totalsum(int[] ar){
        int tsum = 0;
        for(int i=0; i<ar.length; i++){
            tsum +=ar[i];
        }
        return tsum;
    }
    static boolean equalSumPartition(int[] arr){
        int tsum = totalsum(arr);
        int preSum = 0;
        for(int i=0; i<arr.length; i++){
            preSum +=arr[i];
            int sufSum = tsum - preSum;
            if(preSum == sufSum) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(equalSumPartition(arr));
    }
}
