import java.util.*;

public class FruitsIntoBaskets {
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> map = new HashMap<>();
        int i =0, j=0, maxLen = 0;  int n = fruits.length;
        while(j<n){
            if(map.containsKey(fruits[j]))map.put(fruits[j], map.get(fruits[j])+1);
            else map.put(fruits[j], 1);
            while (map.size()>2){
                int freq = map.get(fruits[i]);
                if(freq == 1) map.remove(fruits[i]);
                else map.put(fruits[i], freq-1);
                i++;
            }
            int len = j -i +1;
            maxLen = Math.max(len, maxLen);
            j++;
        }
        return maxLen;
    }

    public static void main(String[] args) {

    }
}
