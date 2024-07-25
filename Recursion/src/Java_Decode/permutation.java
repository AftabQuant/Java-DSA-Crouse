package Java_Decode;

public class permutation{
    static void printPermutation(String ans, String str){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            String left = str.substring(0,i);
            String right = str.substring(i+1);
            printPermutation(ans+ch,left+right);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        printPermutation("",str);
    }
}
