import java.util.Scanner;

public class Practice_Set1{
    static int binary_search(int[] arr, int x){
        int st =0, end = arr.length-1;
        while(st<=end){
            int mid = st+(end-st)/2;
            if(arr[mid]==x) return mid;
            else if(arr[mid]<x) st = mid+1;
            else end = mid-1;
        }
        return -1;
    }
    static boolean Binary_Search(int[] arr, int x, int st, int end){
        if(st>end) return false;
        int mid = st + (end-st)/2;
        if(arr[mid]==x) return true;
        else if(arr[mid]<x) return Binary_Search(arr,x,mid+1,end);
        else return Binary_Search(arr,x,st,mid-1);
    }

    static int square(int[] arr, int x){
        int st =0, end = arr.length-1;
        int ans = -1;
        while(st<=end){
            int mid = st+(end-st);
            if(arr[mid]==x){
                ans = mid;
                end = mid-1;
            } else if(arr[mid]<x){
                st = mid+1;
            }
            else end = mid-1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of queries : ");
        int q = sc.nextInt();
        while(q-->0){
            System.out.println("Enter the finding element : ");
            int x = sc.nextInt();
            System.out.println("Index of the element : "+ square(arr,x));
        }
    }
}
