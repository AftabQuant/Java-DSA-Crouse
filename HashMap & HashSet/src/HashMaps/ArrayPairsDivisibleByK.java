package HashMaps;

import java.util.HashMap;
import java.util.HashSet;

public class ArrayPairsDivisibleByK{
    public static boolean canArrange(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for(int ele: arr){
            int val = ele%k;
            if(val<0) val += k;
            if(map.containsKey(val)) map.put(val,map.get(val)+1);
            else map.put(val,1);
        }
        // Important Part Of This Code
        if(map.containsKey(0)){
            if(map.get(0)%2!=0) return false;
            map.remove(0);
        }
        for(int key: map.keySet()){
            int rem = k-key;
            if(!map.containsKey(rem)) return false;
            int f1 =map.get(key);
            int f2 =map.get(rem);
            if(f1!=f2) return false;
        }
        return true;
    }
    public static void main(String[] args) {

    }

}
