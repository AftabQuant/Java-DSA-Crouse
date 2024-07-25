package Question;
import java.util.Scanner;
import java.util.Stack;
public class PushAtBotttom {
    static void insert(Stack<Integer> st,int x){
        if(st.size()==0){
            st.push(x);
            return;
        }
        int top = st.pop();
        insert(st,x);
        st.push(top);
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
        insert(st,9);
        System.out.print(st);
    }
}
