package Question;
public class ArrayImplementation {
    static class Stack{
        int[] arr = new int[10];
        int idx=0;
        void push(int x){
            arr[idx++] = x;
        }
        int peek(){
            if(idx==0){
                System.out.println("stack is empty");
                return -1;
            }
            return arr[idx-1];
        }
        int pop(){
            if(idx==0){
                System.out.println("stack is empty");
                return -1;
            }
            int top = arr[idx-1];
            arr[idx-1]=0;
            idx--;
            return top;
        }
        int size(){
            return idx;
        }
        void display(){
            for(int i=0;i<idx;i++){
                System.out.print(arr[i]+"\t");
            }
            System.out.println();
        }
        boolean isEmpty(){
            if(idx==0) return true;
            else return false;
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(2);
        st.push(3);
        st.push(5);
        st.display();
        System.out.println(st.peek());
        st.pop();
        st.display();
        System.out.println(st.size());
        System.out.println(st.isEmpty());
    }
}
