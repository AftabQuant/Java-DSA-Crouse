package JavaDecodeBatch;
import java.util.*;

public class builtinFunc{
    public static void main(String[] args){
        Queue<Integer> que = new LinkedList<>();
        que.add(10);
        que.add(20);
        que.add(30);
        que.add(40);
        que.add(50);
        que.add(60);
        que.add(70);
        System.out.println(que);
        que.remove();
        System.out.println(que);// 10
        System.out.println(que.peek()); // 20
        System.out.println(que.size()); //6

    }
}
