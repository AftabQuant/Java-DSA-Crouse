import java.util.HashMap;
import java.util.HashSet;

public class ContainsDuplicate{
    public boolean containsDuplicate(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for(int ele: nums){
            if(set.contains(ele)) return true;
            else set.add(ele);
        }
        return false;
    }
    public static void main(String[] args) {

    }
}
