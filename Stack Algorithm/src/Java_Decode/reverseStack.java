package Java_Decode;

import java.util.Stack;

public class reverseStack{
    static Stack<Integer> copyStack(Stack<Integer> st){
        Stack<Integer> gt = new Stack<>();
        while(!st.isEmpty())    gt.push(st.pop());
        System.out.println(gt);
        Stack<Integer> ft = new Stack<>();
        while(!gt.isEmpty())    ft.push(gt.pop());
        return ft;
    }
    static void displayRev(Stack<Integer> st){
        if(st.isEmpty()) return;
        int top = st.pop();
        System.out.print(top+" ");
        displayRev(st);
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);
        displayRev(st);
    }
}
