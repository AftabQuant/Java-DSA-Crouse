package Question;
import java.util.Scanner;
import java.util.Stack;
public class ReverseStack {
    static void pushAtBottom(Stack<Integer> st,int x){
        if(st.size()==0){
            st.push(x);
            return;
        }
        int top = st.pop();
        pushAtBottom(st,x);
        st.push(top);
    }
    static void reverse(Stack<Integer> st){
        if(st.size()==0){
            return;
        }
        int top = st.pop();
        reverse(st);
        pushAtBottom(st,top);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        reverse(st);
        System.out.println(st);
    }
}
