package Java_Decode;

import java.util.Stack;

public class preFixEvaluation{
    public static void main(String[] args) {
        String str = "-9/*+5346";
        Stack<Integer> st = new Stack<>();
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            int ac = (int) ch;
            if (ac >= 48 && ac <= 57) {
                st.push(ac - 48);
            } else {
                int v1 = st.pop();
                int v2 = st.pop();
                if (ch == '+') st.push(v1 + v2);
                else if (ch == '-') st.push(v1 - v2);
                else if (ch == '*') st.push(v1 * v2);
                else if (ch == '/') st.push(v1 / v2);
            }
        }
        System.out.println(st.peek());
    }
}
