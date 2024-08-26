import java.util.Scanner;

public class SuffixSum {
    static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void suffixSum(int arr[]){
        int n=arr.length;
        for(int i=n-2; i>=0; i--){
            arr[i] = arr[i]+arr[i+1];
        }
    }
    static void prefixSum(int arr[]){
        for(int i=1; i<arr.length; i++) {
            arr[i] = arr[i] + arr[i - 1];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        suffixSum(arr);
        printArray(arr);
    }
}
