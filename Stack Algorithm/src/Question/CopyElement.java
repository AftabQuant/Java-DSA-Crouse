package Question;
import java.util.*;
public class CopyElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        Stack<Integer> gt = new Stack<>();
        while(st.size()>0){
            gt.push(st.peek());
            st.pop();
            // gt.push(st.pop());
        }
        System.out.println(gt);
        Stack<Integer> rt = new Stack<>();
        while(gt.size()>0){
            int x = gt.peek();
            rt.push(x);
            gt.pop();
        }
        System.out.println(rt);
    }
}
