package JavaDecodeBatch;
import java.util.*;

public class removeEvenElement{
    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>();
        Queue<Integer> helper = new LinkedList<>(); int idx = 0;
        que.add(10); que.add(20);
        que.add(30); que.add(40);
        que.add(50); que.add(60);
        que.add(70); que.add(80);
        System.out.println(que);
        while(!que.isEmpty()){
            if(idx%2 == 0) que.remove();
            else{
                helper.add(que.remove());
            }
            idx++;
        }
        System.out.println(helper);
    }
}
