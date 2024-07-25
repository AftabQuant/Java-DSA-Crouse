package Pre_In_PostFix;

import java.util.Stack;

public class postfixEvaluation{
    public static void main(String[] args) {
        String str = "953+4*6/-";
        Stack<Integer> val = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            int asc = (int)ch;
            if(asc>=48 && asc<=57) val.push(asc-48);
            else{
                int v2 = val.pop();
                int v1 = val.pop();
                if(ch=='+') val.push(v1+v2);
                else if(ch=='-') val.push(v1-v2);
                else if(ch=='*') val.push(v1*v2);
                else if(ch=='/') val.push(v1/v2);
            }
        }
        System.out.println(val.peek());
    }
}
