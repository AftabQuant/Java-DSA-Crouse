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
        if(size==arr.length) throw new Error("Heaps Is Full!!!!");
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
    int peek(){
        if(size==0) throw new Error("Empty Heaps");
        return arr[0];
    }
    int size(){
        return size;
    }
    int remove() {
        if(size==0) throw new Error("Empty Heaps !!!!!!!!");
        swapFunc(0,size-1);
        int num = arr[size-1];
        size--;
        downHeapify(0);
        return num;
    }
    void downHeapify(int p){
        if(p>=size) return;
        int lc = 2*p +1;
        int rc = 2*p +2;
        int min = p;
        if(lc< size && arr[lc]<arr[min]) min = lc;
        if(rc< size && arr[rc]<arr[min]) min = rc;
        if(p == min) return;
        swapFunc(p,min);
        downHeapify(min);
    }
}
public class ImplementsMinHeap {
    public static void main(String[] args) {
        minHeaps pq = new minHeaps(10);
        pq.add(20);
        pq.add(35);
        pq.add(12);
        System.out.println(pq.peek());
        pq.add(45);
        System.out.println(pq.remove());
        System.out.println(pq.peek());
    }
}