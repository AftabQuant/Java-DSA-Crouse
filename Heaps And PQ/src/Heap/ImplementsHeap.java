package Heap;

class minHeaps{
    int[] arr;
    int size = 0;
    minHeaps(int n){
        arr = new int[n];
    }
    void swapFunc(int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    void add(int val){
        arr[size++] = val;
        upHeapify(size-1);
    }
    void upHeapify(int child){
        if(child == 0) return;
        int parent = (child - 1)/2;
        if(arr[parent]>arr[child]){
            swapFunc(child, parent);
            upHeapify(parent);
        }
    }
    int peek() throws Error{
        if(size==0) throw new Error("Empty Heaps");
        return arr[0];
    }
    int size(){return size;}
    int remove() {
        if(size==0) throw new Error("Empty Heaps");
        
    }
}
public class ImplementsHeap {
    public static void main(String[] args) {
        minHeaps pq = new minHeaps(10);
        System.out.println(pq.peek());
        pq.add(20);
        pq.add(35);
        pq.add(12);
        System.out.println(pq.peek());
    }
}