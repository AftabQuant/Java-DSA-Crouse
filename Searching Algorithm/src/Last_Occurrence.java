import java.util.Scanner;

public class Last_Occurrence{
    static int occurrence(int[] arr, int x){
        int st = 0, end = arr.length-1;
        int ans = -1;
        while(st<=end){
            int mid = st + (end-st)/2;
            if(arr[mid] == x){
                ans = mid;
                st = mid+1;
            } else if(arr[mid]<x){
                st = mid+1;
            }
            else end = mid-1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,5,5,5,5,5,6};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of queries : ");
        int q = sc.nextInt();
        while(q-->0){
            System.out.println("Enter the finding element : ");
            int x = sc.nextInt();
            System.out.println("Index of the element : "+ occurrence(arr,x));
        }
    }
}
