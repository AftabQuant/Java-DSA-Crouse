package Pre_In_PostFix;
import java.util.Stack;

public class infixToPrefix{
    public static void main(String[] args) {
        String str = "9-(5+3)*4/6";
        Stack<String> st = new Stack<>();
        Stack<Character> op = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            int asc = (int)ch;
            if(asc>=48 && asc<=57){
                String s = ""+ch;
                st.push(s);
            }else if(op.isEmpty() || ch=='(' || op.peek()=='(') op.push(ch);
            else if(ch==')'){
                while(op.peek()!='('){
                    String v2 = st.pop();
                    String v1 = st.pop();
                    char c = op.pop();
                    String t = c+v1+v2;
                    st.push(t);
                }
                op.pop();
            }
            else{
                if(ch=='+' || ch=='-'){
                    String v2 = st.pop();
                    String v1 = st.pop();
                    char c = op.pop();
                    String t = c+v1+v2;
                    st.push(t);
                    op.push(ch);
                }
                else if(ch=='*' || ch=='/'){
                    if(op.peek()=='*' || op.peek()=='/'){
                        String v2 = st.pop();
                        String v1 = st.pop();
                        char c = op.pop();
                        String t = c+v1+v2;
                        st.push(t);
                        op.push(ch);
                    }
                    else op.push(ch);
                }
            }
        }
        while(st.size()>1){
            String v2 = st.pop();
            String v1 = st.pop();
            char c = op.pop();
            String t = c+v1+v2;
            st.push(t);
        }
        System.out.println(st.peek());
    }
}
