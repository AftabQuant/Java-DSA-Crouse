package Java_Decode;
import java.util.Stack;

public class infixToPostfix{
    public static void main(String[] args) {
        String str = "9-(5+3)*4/6";
        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            int asc = (int)ch;
            if(asc>=48 && asc<=57){
                String s = ""+ch;
                val.push(s);
            }
            else if(op.isEmpty() || ch =='(' || op.peek()=='(') op.push(ch);
            else if(ch == ')'){
                while(op.peek()!='('){
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char a = op.pop();
                    String t = v1+v2+a;
                    val.push(t);
                }
                op.pop();
            }
            else{
                if(ch=='+' || ch=='-'){
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char a = op.pop();
                    String t = v1+v2+a;
                    val.push(t);
                    op.push(ch);
                }
                else if(ch=='*' || ch=='/'){
                    if(op.peek()=='*' || op.peek()=='/'){
                        String v2 = val.pop();
                        String v1 = val.pop();
                        char a = op.pop();
                        String t = v1+v2+a;
                        val.push(t);
                        op.push(ch);
                    }
                    else op.push(ch);
                }
            }
        }
        while(val.size()>1){
            String v2 = val.pop();
            String v1 = val.pop();
            char a = op.pop();
            String t = v1+v2+a;
            val.push(t);
        }
        System.out.println(val.peek());
    }
}
