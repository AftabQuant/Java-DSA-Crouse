import java.util.*;
public class RecursiveBinarySearch{
    static boolean binaryserach(int[] arr, int st, int end, int x){
        if(st>end) return false;
        int mid = st+ (end-st)/2;
        if(arr[mid] == x){
            return true;
        } else if(x<arr[mid]){
            return binaryserach(arr,st,mid-1,x);
        } else return binaryserach(arr,mid+1,end,x);
    }
    public static void main(String[] args) {
        int[] ar = {1,2,3,4,5,6,7,8,9,10};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the quires : ");
        int q = sc.nextInt();
        while(q-->0){
            System.out.println("Enter the target : ");
            int x = sc.nextInt();
            System.out.println(binaryserach(ar,0,ar.length-1,x));
        }
    }
}
