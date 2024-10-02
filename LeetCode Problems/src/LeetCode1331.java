import java.util.*;

public class LeetCode1331{
    public static int[] arrayRankTransform(int[] arr){
        int[] ans = new int[arr.length];
        TreeSet<Integer> set = new TreeSet<>();
        for(int ele: arr){
            set.add(ele);
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        int rank = 1;
        for(int ele: set){
            map.put(ele, rank++);
        }
        for(int i=0; i<arr.length; i++){
            ans[i] = map.get(arr[i]);
        }
        return ans;
    }
    public static void main(String[] args) {

    }
}
