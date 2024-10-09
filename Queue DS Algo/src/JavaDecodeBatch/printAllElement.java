package JavaDecodeBatch;
import java.util.*;

public class printAllElement{
    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>();
        Queue<Integer> helper = new LinkedList<>();
        que.add(10); que.add(20);
        que.add(30); que.add(40);
        que.add(50); que.add(60);
        que.add(70); que.add(80);
        System.out.println(que);
        while(!que.isEmpty()){
            System.out.print(que.peek()+",");
            helper.add(que.poll());
        }
        while(!helper.isEmpty()) que.add(helper.poll());
    }
}
