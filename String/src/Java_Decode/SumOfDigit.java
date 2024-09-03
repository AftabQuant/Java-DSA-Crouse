package Java_Decode;

public class SumOfDigit{
    public static int getLucky(String s, int k){
        String ans = "";
        for(int i=0; i<s.length(); i++){
            int idx = (int) s.charAt(i) - 96;
            ans +=idx;
        }
        int key = 0;
        while(k-->0){
            key = 0;
            for(int i=0; i<ans.length(); i++){
                key += Character.getNumericValue(ans.charAt(i));
            }
            ans = String.valueOf(key);
        }
        return key;
    }
    public static void main(String[] args) {
        String s = "zbax";
        System.out.println(getLucky(s,3));
    }
}
