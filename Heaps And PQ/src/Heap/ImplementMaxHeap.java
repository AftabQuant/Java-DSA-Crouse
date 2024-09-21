package Heap;

class MaxHeap{
    int[] arr;
    int size = 0;
    MaxHeap(int n){
        arr = new int[n];
    }
    void swapFunc(int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    void add(int num){
        arr[size++] = num;
        upHeapify(size-1);
    }
    void upHeapify(int child){
        int parent = (child-1)/2;
        if(arr[parent]<arr[child]){
            swapFunc(parent, child);
            upHeapify(parent);
        }
    }
    int peek(){
        if(size==0) throw new Error("Empty Heaps");
        return arr[0];
    }
    int size(){return size;}
    int remove(){
        int top = arr[0];
        swapFunc(0,size-1);
        size--;
        downHeapify(0);
        return top;
    }
    void downHeapify(int p){
        if(p>=size) return;
        int lc = 2*p+1;
        int rc = 2*p+2;
        int max = p;
        if(lc<size && arr[lc]>arr[p]) max = lc;
        if(rc<size && arr[rc]>arr[p]) max = rc;
        if(p == max) return;
        swapFunc(p,max);
        downHeapify(max);
    }
}
public class ImplementMaxHeap{
    public static void main(String[] args) {
        MaxHeap pq = new MaxHeap(10);
        pq.add(34);
        pq.add(20);
        System.out.println(pq.peek());
        pq.add(35);
        pq.add(65);
        System.out.println(pq.remove());
        pq.add(12);
        System.out.println(pq.peek());
        pq.add(45);
        System.out.println(pq.remove());
    }
}
