package Java_Decode;

class stack{
    private int[] arr = new int[10];
    private int idx = 0;
    void push(int val){
        arr[idx++] = val;
    }
    int peek() throws Error{
        if(idx == 0) throw new Error("Empty Stack !!!!!");
        return arr[idx-1];
    }
    int pop() throws Error{
        if(idx == 0) throw new Error("Empty Stack !!!!!");
        int top = arr[idx-1];
        arr[idx-1] = 0;
        idx--;
        return top;
    }
    void display(){
        for(int i=0; i<idx; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    boolean isEmpty(){
        if(idx == 0) return true;
        else return false;
    }
    boolean isFull(){
        if(idx == arr.length ) return true;
        else return false;
    }
    int size(){
        return idx;
    }
}
public class ArrayImplementation {
    public static void main(String[] args) {
        stack st = new stack();
        System.out.println(st.isEmpty());
        System.out.println(st.isFull());
        st.push(10);
        st.push(2);
        st.push(3);
        System.out.println(st.isEmpty());
        System.out.println(st.isFull());
        st.push(4);
        System.out.println(st.size());
        st.display();
        System.out.println(st.peek());
        st.pop();
        st.display();
        System.out.println(st.peek());
        System.out.println(st.size());
        st.pop();
    }
}
