package TreeSetAndTreeMap;

import java.util.*;

public class TreeSets {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        // Insert Element In Set
        set.add(10);
        set.add(30);
        set.add(-8);
        set.add(50);
        set.add(45);
        // Print All Elements & Size Of Set
        System.out.println(set+"  Size is: "+set.size());
        // Remove Element
        set.remove(30);
        System.out.println(set+"  Size is: "+set.size());
        // Search Element
        System.out.println(set.contains(10));
        //toArray Method Of Set
        Object[] arr = set.toArray();
        for(Object ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
