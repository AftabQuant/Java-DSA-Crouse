package Java_Decode;

import java.util.Stack;

public class postfixEvaluation{
    public static void main(String[] args) {
        String str = "953+4*6/-";
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            int ac = (int)ch;
            if(ac>=48 && ac<=57){
                st.push(ac-48);
            }
            else{
                int v2 = st.pop();
                int v1 = st.pop();
                if(ch=='+') st.push(v1+v2);
                else if(ch=='-') st.push(v1-v2);
                else if(ch=='*') st.push(v1*v2);
                else if(ch=='/') st.push(v1/v2);
            }
        }
        System.out.println(st.peek());
    }
}
