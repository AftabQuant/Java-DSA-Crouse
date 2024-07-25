package Java_Decode;

import java.util.Stack;

public class infixToPrefix{
    public static void main(String[] args) {
        String str = "9-(5+3)*4/6";
        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            int asc = (int)ch;
            if(asc>=48 && asc<=57){
                String s=""+ch;
                val.push(s);
            }
            else if(op.isEmpty() || op.peek()=='(' || ch == '(') op.push(ch);
            else if(ch == ')'){
                while(op.peek()!='('){
                    char c = op.pop();
                    String v2 = val.pop();
                    String v1 = val.pop();
                    String ans = c+v1+v2;
                    val.push(ans);
                }
                op.pop();
            }
            else{
                if(ch=='+' || ch=='-'){
                    char c = op.pop();
                    String v2 = val.pop();
                    String v1 = val.pop();
                    String ans = c+v1+v2;
                    val.push(ans);
                    op.push(ch);
                }
                else if(ch=='*' || ch=='/'){
                    if(op.peek()=='*' || op.peek()=='/'){
                        char c = op.pop();
                        String v2 = val.pop();
                        String v1 = val.pop();
                        String ans = c+v1+v2;
                        val.push(ans);
                        op.push(ch);
                    }
                    else op.push(ch);
                }
            }
        }
        while(val.size()>1){
            char c = op.pop();
            String v2 = val.pop();
            String v1 = val.pop();
            String ans = c+v1+v2;
            val.push(ans);
        }
        System.out.println(val.peek());
    }
}

