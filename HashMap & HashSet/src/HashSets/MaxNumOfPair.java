package HashSets;

import java.util.HashSet;

public class MaxNumOfPair{
        public static String Reverse(String str){
            StringBuilder st = new StringBuilder(str);
            st.reverse();
            return st.toString();
        }
        static int maximumNumberOfStringPairs(String[] words) {
            HashSet<String> set = new HashSet<>();
            int cnt =0;
            for(String ele: words){
                String rev = Reverse(ele);
                if(set.contains(rev)){
                    cnt++;
                    set.remove(rev);
                }
                else set.add(ele);
            }
            return cnt;
        }
    public static void main(String[] args) {
            String[] str = {"cd","ac","dc","ca","zz"};
            System.out.println(maximumNumberOfStringPairs(str));
    }
}
