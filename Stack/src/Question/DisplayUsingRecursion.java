package Question;
import java.util.Scanner;
import java.util.Stack;
public class DisplayUsingRecursion {
    static void display(Stack<Integer> st){
        if(st.size() == 0) return;
        int top = st.pop();
        display(st);
        System.out.print(top+"\t");
        st.push(top);
        return;
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
        display(st);
    }
}
