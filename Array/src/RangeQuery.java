import java.util.Scanner;
public class RangeQuery {
    static int[] prefixSum(int arr[]){
        for(int i=1; i<arr.length; i++){
            arr[i]=arr[i]+arr[i-1];
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n=sc.nextInt();
        int arr[] = new int[n+1];
        for(int i=1 ; i <=n ;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter no. of quiries: ");
        int q=sc.nextInt();
        int pref[]=prefixSum(arr);
        while(q-->0){
            int l=sc.nextInt();
            int r=sc.nextInt();
            int sum = pref[r] - pref[l-1];
            System.out.println("sum: "+sum);
        }
    }
}
