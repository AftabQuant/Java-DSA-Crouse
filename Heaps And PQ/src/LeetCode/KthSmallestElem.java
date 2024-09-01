package LeetCode;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestElem{
    static void swapFunc(int[] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    // Using Selection Sort
    static int Method1(int[] arr, int k){
        for(int i=0; i<k; i++){
            int min = i;
            for(int j=i+1; j<arr.length-1; j++){
                if(arr[min]>arr[j]) min = j;
            }
            swapFunc(arr,min,i);
        }
        return arr[k-1];
    }
    // Using BuildIn Sort Function
    static int Method2(int[] arr, int k){
        Arrays.sort(arr);
        return arr[k-1];
    }
    // Using Heaps Algorithm
    static int method3(int[] arr, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int j : arr) {
            pq.add(j);
            if(pq.size()>k) pq.remove();
        }
        return pq.peek();
    }
    public static void main(String[] args) {
        int[] arr = {10,2,3,8,-4,-2,6};
        int k = 3;
        System.out.println(Method1(arr,k));
        System.out.println(Method2(arr, k));
        System.out.println(method3(arr, k));
    }
}
