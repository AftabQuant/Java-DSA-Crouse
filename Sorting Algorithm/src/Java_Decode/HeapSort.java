package Java_Decode;

import java.util.PriorityQueue;

public class HeapSort{
    static void heapSort(int[] arr){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int ele: arr){
            pq.add(ele);
        }
        int idx = 0;
        while(!pq.isEmpty()){
            arr[idx++] = pq.remove();
        }
    }
    static void printArray(int[] arr){
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        heapSort(arr);
        printArray(arr);
    }
}
