package HashSets;

import java.util.HashSet;

public class printIterative{
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        // Insert Element In Set
        set.add(10);
        set.add(30);
        set.add(-8);
        set.add(50);
        set.add(45);
        set.add(24);
        set.add(-34);
        for(int ele : set){
            System.out.print(ele+" ");
        }
        System.out.println();
        System.out.println(set);
    }
}
