package HashMaps;

import java.util.HashMap;

public class MapIterative{
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Aftab",32);
        map.put("Mohit",33);
        map.put("Monu",34);
        map.put("Kunal",31);
        map.put("Aditya",30);
        map.put("Ariful",23);
        // Print Using Key
        for(String key: map.keySet()){
            System.out.print(key+" -> "+map.get(key));
            System.out.println();
        }
        // Print Using Value
        for(Integer value: map.values()){
            System.out.print(value+" -> ");
            System.out.println();
        }
        // Using Object
        for(Object pair: map.entrySet()){
            System.out.print(pair);
            System.out.println();
        }
    }
}
