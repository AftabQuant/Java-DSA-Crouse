package Pre_In_PostFix;
import java.util.Stack;

public class infixEvaluation{
    public static void main(String[] args){
        String str = "9-(5+3)*4/6";
        Stack<Integer> val = new Stack<>();
        Stack<Character> ope = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            int asc = (int)ch;
            if(asc>=48 && asc<=57) val.push(asc-48);
            else if(ope.isEmpty() || ch=='(' || ope.peek()=='(') ope.push(ch);
            else if(ch == ')'){
                while(ope.peek()!='('){
                    int v2 = val.pop();
                    int v1 = val.pop();
                    if(ope.peek()=='+') val.push(v1+v2);
                    else if(ope.peek()=='-') val.push(v1-v2);
                    if(ope.peek()=='*') val.push(v1*v2);
                    if(ope.peek()=='/') val.push(v1/v2);
                    ope.pop();
                }
                ope.pop();
            }
            else{
                if(ch=='*' || ch=='/'){
                    if(ope.peek()=='*' || ope.peek()=='/'){
                        int v2 = val.pop();
                        int v1 = val.pop();
                        if(ope.peek()=='*') val.push(v1*v2);
                        if(ope.peek()=='/') val.push(v1/v2);
                        ope.pop();
                        ope.push(ch);//
                    }
                    else ope.push(ch);
                }
                if(ch=='+' || ch=='-') {
                    int v2 = val.pop();
                    int v1 = val.pop();
                    if (ope.peek() == '+') val.push(v1 + v2);
                    if (ope.peek() == '-') val.push(v1 - v2);
                    if (ope.peek() == '*') val.push(v1 * v2);
                    if (ope.peek() == '/') val.push(v1 / v2);
                    ope.pop();
                    ope.push(ch); //
                }
            }
        }
        while(val.size()>1){
            int v2 = val.pop();
            int v1 = val.pop();
            if(ope.peek()=='+') val.push(v1+v2);
            if(ope.peek()=='-') val.push(v1-v2);
            if(ope.peek()=='*') val.push(v1*v2);
            if(ope.peek()=='/') val.push(v1/v2);
            ope.pop();
        }
        System.out.println(val.peek());
    }
}
