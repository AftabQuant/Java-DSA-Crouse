package LeetCode;

import java.util.Scanner;

public class InsertionInArray{
    static void print(int[] arr){
        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }
    static void insertion(int[] arr, int ele, int pos){

        if(pos==arr.length){
            System.out.print("Full Array ----------");
            return;
        }
        int n = arr.length-1;
        for(int i=n; i>pos; i--){
            arr[i] = arr[i-1];
        }
        arr[pos] = ele;
        n++;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Try-------->");
        int x = sc.nextInt();
        int[] arr = {1,2,3,4,5,6};
        while(x-->0){
            System.out.println("Enter The Element : ");
            int ele = sc.nextInt();
            System.out.println("Enter The Position: ");
            int pos = sc.nextInt();
            insertion(arr,ele, pos);
            print(arr);
        }
    }
}
