import java.util.*;
public class SuffixSum2 {
    static int[] suffixsum(int[] ar){
        for(int i = ar.length-2; i>=0; i--){
            ar[i] = ar[i]+ar[i+1];
        }
        return ar;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int[] ans = suffixsum(arr);
        for(int i=0; i<n; i++){
            System.out.println(ans[i]);
        }
    }
}
