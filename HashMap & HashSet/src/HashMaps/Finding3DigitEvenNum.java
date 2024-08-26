package HashMaps;
import java.util.*;

public class Finding3DigitEvenNum{
    public static int[] findEvenNumbers(int[] digits){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int ele: digits){
            if(map.containsKey(ele)) map.put(ele,map.get(ele)+1);
            else map.put(ele,1);
        }
        List<Integer> ans = new ArrayList<>();
        for(int i=100; i<1000; i+=2){
            int x = i;
            int a = x%10; x/=10;
            int b = x%10; x/=10;
            int c = x;
            if(map.containsKey(a)){
                int aFreq = map.get(a);
                map.put(a, aFreq-1);
                if(aFreq==1) map.remove(a);
                if(map.containsKey(b)){
                    int bFreq = map.get(b);
                    map.put(b, bFreq-1);
                    if(bFreq==1) map.remove(b);
                    if(map.containsKey(c)){
                        ans.add(i);
                    }
                    map.put(b, bFreq);
                }
                map.put(a,aFreq);
            }
        }
        int[] ans2 = new int[ans.size()];
        for(int i=0; i<ans2.length; i++){
            ans2[i] = ans.get(i);
        }
        return ans2;
    }
    public static void main(String[] args){
        int[] digits = {2,1,3,0};
        int[] ans = findEvenNumbers(digits);
        for(int ele: ans){
            System.out.print(ele+" ");
        }
    }
}
