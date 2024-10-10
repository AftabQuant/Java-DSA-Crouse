package Java_Decode;
import java.util.Stack;

public class MinAddToValid{
    public static int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char top = s.charAt(i);
            if(top == '(') st.push(top);
            else {
                if(!st.isEmpty() && st.peek()=='('){
                    st.pop();
                }
                else st.push(top);
            }
        }
        return st.size();
    }
    public static void main(String[] args) {

    }
}
