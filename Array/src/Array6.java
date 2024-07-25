import java.util.*;
public class Array6 {
    static int[] makePrefixSum(int[] arr){
        for(int i=1; i<arr.length; i++){
            arr[i] +=arr[i-1];
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the size : ");
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        for(int i=1; i<=n; i++){
            arr[i] = sc.nextInt();
        }
        int[] ans = makePrefixSum(arr);
        System.out.println("Enter queries : ");
        int q = sc.nextInt();
        while(q-->0){
            System.out.println("Enter range : ");
            int l = sc.nextInt();
            int r = sc.nextInt();
            int result = ans[r]-ans[l-1];
            System.out.println("Sum is : "+result);
        }
    }
}
