package HashMaps;

import java.util.HashMap;

public class Basics{
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        // Add Pairs
        map.put("Aftab",32);
        map.put("Mohit",33);
        map.put("Monu",34);
        map.put("Kunal",31);
        map.put("Aditya",30);
        // Print Pairs & Size
        System.out.println(map+"  Size is: "+map.size());
        // Search pair
        System.out.println(map.containsKey("Aftab"));
        System.out.println(map.containsValue(34));
        // Remove Pair
        map.remove("Kunal");
        System.out.println(map+"  Size is: "+map.size());
        // Find Value From Key
        map.get("Mohit");
    }
}
