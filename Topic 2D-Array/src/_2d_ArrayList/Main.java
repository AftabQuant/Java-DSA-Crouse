package _2d_ArrayList;
import java.util.*;
public class Main{
    public static void main(String[] args){
        List<Integer> a = new ArrayList<>();
        a.add(10); a.add(20); a.add(30);
        List<Integer> b = new ArrayList<>();
        b.add(40); b.add(50);
        List<Integer> c = new ArrayList<>();
        c.add(60);
        List<Integer> d = new ArrayList<>();
        List<List<Integer>> ll = new ArrayList<>();
        ll.add(a); ll.add(b); ll.add(c); ll.add(d);
        for (List<Integer> x : ll) {
            for (Integer integer : x) {
                System.out.print(integer + "\t");
            }
            System.out.println();
        }
    }
}
