package JavaDecodeBatch;
import java.util.*;

public class reverseUsStack{
    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>();
        Stack<Integer> st = new Stack<>();
        que.add(10); que.add(20);
        que.add(30); que.add(40);
        que.add(50); que.add(60);
        que.add(70); que.add(80);
        System.out.println(que);
        while(!que.isEmpty()){
            st.push(que.remove());
        }
        System.out.println(st);
        while(!st.isEmpty()){
            que.add(st.pop());
        }
        System.out.println(que);
    }
}
