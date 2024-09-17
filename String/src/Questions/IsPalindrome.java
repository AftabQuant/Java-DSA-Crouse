package Questions;

import java.util.Locale;

public class IsPalindrome{
    public boolean isPalindrome(String s){
        if(s.isEmpty()) return true;
        s = s.trim().toLowerCase();
        int i = 0; int j = s.length()-1;
        while(i<=j){
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(j);
            if(ch1>=97 && ch1<=122 || ch1>=48&& ch1<=57){
                if(ch2>=97 && ch2<=122 || ch2>=48&& ch2<=57){
                    if(ch1!=ch2) return false;
                    else{
                        i++; j--;
                    }
                }
                else j--;
            }
            i++;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        System.out.println(str);
        str = str.trim().toLowerCase();
        System.out.println(str);
    }
}
