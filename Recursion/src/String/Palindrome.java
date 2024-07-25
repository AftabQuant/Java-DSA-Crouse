package String;

public class Palindrome {
    static boolean palindrome(String st) {
        int i = 0, j = st.length() - 1;
        if (st.charAt(i) == st.charAt(j)) {
            return true;
        } else {
            return false;
        }
    }
    static boolean isPalindrome(String st, int l, int r){
        if(l>=r) return true;
        return (st.charAt(l) == st.charAt(r) && isPalindrome(st,l+1,r-1));
    }
    public static void main(String[] args) {
        String st = "abcba";
        System.out.println(isPalindrome(st,0,st.length()-1));
    }
}
