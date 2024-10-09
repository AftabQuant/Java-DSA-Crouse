package Pre_In_PostFix;

import java.util.Stack;

public class prefixToInfix{
    public static void main(String[] args) {
        String str = "-9/*+5346";
        Stack<String> st = new Stack<>();
        for(int i=str.length()-1; i>=0; i--){
            char ch = str.charAt(i);
            int asc = (int)ch;
            if(asc>=48 && asc<=57){
                String s = ""+ch;
                st.push(s);
            }
            else{
                String v1 = st.pop();
                String v2 = st.pop();
                String t = "("+v1+ch+v2+")";
                st.push(t);
            }
        }
        String ans = st.pop();
        System.out.println(ans);
    }
}
