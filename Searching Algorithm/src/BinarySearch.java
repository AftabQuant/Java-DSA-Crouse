import java.util.*;
public class BinarySearch {
    static boolean binaryserach(int[] ar, int x){
        int n = ar.length;
        int st = 0, end = n-1;
        while(st<=end){
            int mid = st + (end-st)/2;
            if(ar[mid] == x){
                return true;
            } else if(x<ar[mid]){
                end = mid-1;
            } else if(x>ar[mid]){
                st = mid+1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] ar = {1,2,3,4,5,6,7,8,9,10};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the quires : ");
        int q = sc.nextInt();
        while(q-->0){
            System.out.println("Enter the target : ");
            int x = sc.nextInt();
            System.out.println(binaryserach(ar,x));
        }

    }
}
