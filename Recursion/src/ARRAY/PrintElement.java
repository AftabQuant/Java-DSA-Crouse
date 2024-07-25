package ARRAY;

import java.util.Scanner;

public class PrintElement{
    static void printArray(int[] arr, int idx){
        if(idx==arr.length) return;
        System.out.print(arr[idx]+"\t");
        printArray(arr,idx+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int x = sc.nextInt();
        int[] arr = new int[x];
        for(int i=0; i<x; i++){
            arr[i] = sc.nextInt();
        }
        printArray(arr,0);
    }
}
