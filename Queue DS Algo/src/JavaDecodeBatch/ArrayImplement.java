package JavaDecodeBatch;

class queue{
    int[] arr = new int[10];
    int f = -1; int r = -1; int size = 0;
    void display(){
        for(int i=f; i<=r; i++){
            System.out.print(arr[i]+",");
        }
        System.out.println();
    }
    void add(int val){
        if(f == -1){
            f = r = 0;
            arr[0] = val;
        }
        else{
            arr[++r] = val;
        }
        size++;
    }
    int remove(){
        if(size == 0) return -1;
        int x = arr[f];
        arr[f++] = f;
        size--;
        return x;
    }
    int peek(){
        return arr[f];
    }
    int size(){
        return size;
    }
}
public class ArrayImplement{
    public static void main(String[] args) {
        queue q = new queue();
        q.add(2);q.add(3);
        q.add(2);q.add(3);
        q.add(2);q.add(3);
        q.display();
        q.remove();
        q.display();
        System.out.println(q.peek());
        System.out.println(q.size);
    }
}
