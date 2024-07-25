package Java_Decode;
import java.util.*;
class stackk {
    List<Integer> arr = new ArrayList<>();
    int idx = 0;
    void push(int val){
        arr.add(val);
        idx++;
    }
    void display(){
        for(int i=0; i<idx; i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
    }
    int peek() throws Error{
        if(idx == 0) throw new Error("Empty Stack !!!!!!!!");
        return arr.get(idx-1);
    }
    int pop(){
        if(idx == 0) throw new Error("Empty Stack !!!!!!!!");
        int top = arr.get(idx-1);
        arr.set((idx-1),0);
        idx--;
        return top;
    }
    int size(){
        return idx;
    }
    boolean isEmpty(){
        if(idx==0) return true;
        else return false;
    }
    boolean isFull(){
        if(idx==arr.size()) return true;
        else return false;
    }
}
public class ArrayListImplementation{
    public static void main(String[] args) {
        stackk st = new stackk();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.display();
        st.pop();
        st.display();
        st.push(50);
        System.out.println(st.size());
    }
}
