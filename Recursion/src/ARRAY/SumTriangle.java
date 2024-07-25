package ARRAY;

import java.util.Scanner;

public class SumTriangle {
    static void printArray(int[] ar, int idx){
        int n = ar.length;
        if(n<1) return;
        int[] temp = new int[n-1];
        for(int i=0; i<n-1; i++){
            temp[i] = ar[i]+ar[i+1];
        }
        printArray(temp,idx-1);
        for(int i: ar){
            System.out.print(i+"\t");
        }
        System.out.println();
    }
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size of Array : ");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for(int i=0; i<n; i++){
//            arr[i] = sc.nextInt();
//        }
        int[] arr = {1,2,3,4,5};
        printArray(arr,0);
    }
}
