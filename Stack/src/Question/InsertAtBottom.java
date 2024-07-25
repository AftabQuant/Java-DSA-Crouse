package Question;
import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;
import java.util.Stack;
public class InsertAtBottom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        Stack<Integer> rt = new Stack<>();
        while(st.size()>0){ // insert any index
            rt.push(st.pop());
        }
        System.out.print("Enter the element: ");
        int x = sc.nextInt();
        rt.push(x);
        while(rt.size()>0){
            st.push(rt.pop());
        }
        System.out.println(st);
    }
}
