import java.util.Scanner;

public class RangePrefixSum{
    static void printArray(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    static int[] prefixSum(int[] arr){
        for(int i=1; i<arr.length; i++){
            arr[i] += arr[i-1];
        }
        return arr;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7};
        int[] pref = prefixSum(arr);
        while(true){
            System.out.println("Enter Range : ");
            int l = sc.nextInt();
            int r = sc.nextInt();
            int sum = pref[r] - pref[l -1];
            System.out.println("The sum is: "+sum);
            System.out.println("Try Once More");
            String s = sc.next();
            if(s.equals("No") || s.equals("no")) break;
        }
    }

}
