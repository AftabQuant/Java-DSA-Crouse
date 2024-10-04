package HashMaps;
import java.util.*;

public class DividePlayer{
    public static long dividePlayers(int[] skill){
        int n = skill.length;
        int teams = n / 2;
        int[] arr = new int[teams];
        int sum = 0;
        for(int ele: skill) sum += ele;
        int target = sum / teams;
        Map<Integer, Integer> map = new HashMap<>();
        for(int ele: skill){
            if(map.containsKey(ele)) map.put(ele, map.get(ele)+ 1);
            else map.put(ele, 1);
        }
        if(sum % teams != 0) return -1;
        long res = 0;
        for (int top : skill) {
            if (map.get(top) == 0) continue;
            map.put(top, map.get(top) - 1);
            int rem = target - top;
            if (!map.containsKey(rem) || map.get(rem) == 0) return -1;
            map.put(rem, map.get(rem) -1);
            res = res + (long) ((long) top * rem);
        }
        return res;
    }
    public static void main(String[] args) {

    }
}
