import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(4);
        st.push(5);
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.push(6);
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println("Size is : "+st.size());
    }
}