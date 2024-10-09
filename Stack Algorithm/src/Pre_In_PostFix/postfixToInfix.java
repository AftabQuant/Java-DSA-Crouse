package Pre_In_PostFix;

import java.util.Stack;

public class postfixToInfix{
    public static void main(String[] args) {
        String str = "953+4*6/-";
        Stack<String> st = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            int asc = (int)ch;
            if(asc>=48 && asc<=57){
                String s = ""+ch;
                st.push(s);
            }
            else{
                String v2 = st.pop();
                String v1 = st.pop();
                String t = '('+v1+ch+v2+')';
                st.push(t);
            }
        }
        String ans = st.pop();
        System.out.println(ans);
    }
}
