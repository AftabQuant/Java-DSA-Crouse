package HashSets;

import java.util.HashSet;

public class countDistinctElement{
    static int reverse(int num){
        int rev = 0;
        while(num>0){
            rev = rev*10 + num%10;
            num /=10;
        }
        return rev;
    }
    static int count(int[] num){
        HashSet<Integer> set = new HashSet<>();
        for (int j : num){
            set.add(j);
            set.add(reverse(j));
        }
        return set.size();
    }
    public static void main(String[] args){
        int[] nums = {12,34,1,21,67};
        System.out.println("Distinct Element  is : "+count(nums));

    }
}
