import java.util.*;
public class Main {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        Queue<Integer> a = new LinkedList<>();
        while(q.size()>0){
            a.add(q.remove());
        }
        System.out.println(a);
        while(a.size()>0){
            q.add(a.remove());
        }
        System.out.println(q);
    }
}