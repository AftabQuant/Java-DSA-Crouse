package Java_Decode;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.StreamSupport;

public class Temporary_A{
    static String purify(String s){
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)!='0') return s.substring(i);
        }
        return s;
    }
    static String max(String a, String b){
        String s = purify(a); String t = purify(b);
        if(s.length()>t.length()) return a;
        else if(s.length()<t.length()) return b;
        for(int i=0; i<a.length(); i++){
            if(s.charAt(i)!=t.charAt(i)){
                if(s.charAt(i)>t.charAt(i)) return a;
                else return b;
            }
        }
        if(a.length()>=b.length()) return a;
        else return b;
    }
    static String maxValue(String[] st){
        String maxS = st[0];
        for(int i=1; i<st.length; i++){
            maxS = max(maxS,st[i]);
        }
        return maxS;
    }
    static int maxString(String s, String t){
        int n = Integer.parseInt(s);
        int m = Integer.parseInt(t);
        int max = Math.max(n,m);
        return max;
    }
    static boolean isIsomorphic(String s, String t){
        char[] a = new char[128];
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            char dh = t.charAt(i);
            int idx = (int) ch;
            if (a[idx] == '\0') a[idx] = dh;
            else {
                if(a[idx]!=dh) return false;
            }
        }
        char[] b = new char[128];
        for(int i=0; i<t.length(); i++) {
            char ch = s.charAt(i);
            char dh = t.charAt(i);
            int idx = (int) dh;
            if (b[idx] == '\0') a[idx] = ch;
            else {
                if(b[idx]!=ch) return false;
            }
        }
        return true;
    }
    static void swapFunction(StringBuilder sb, int i, int j){
        while(i<=j){
            char temp = sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j,temp);
            i++;j--;
        }
    }
    static void maxOccurrence(StringBuilder sb){
        char[] ch = sb.toString().toCharArray();
        int[] freq = new int[26];
        for(char temp : ch){
            int idx = (int)temp - 97;
            freq[idx]++;
        }
        int mx = -1;
        int index = -1;
        for (int j : freq) {
            mx = Math.max(mx, j);
        }
        for(int i=0; i<freq.length; i++){
            if(mx == freq[i]){
                char ans = (char)(i+97);
                System.out.println(ans+"\t");
            }
        }
    }
    static boolean isAnagram(String s, String b){
        char[] ch = s.toCharArray();
        char[] sh = b.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(sh);
        for(int i=0; i<ch.length; i++){
            if(ch[i]!=sh[i]) return false;
        }
        return true;
    }
    static void reverseEachWord(StringBuilder sb){
        int n = sb.length();
        int i=0,j=0;
        while(j<n){
            if(sb.charAt(j)!=' ') j++;
            else{
                swapFunction(sb,i,j-1);
                i = j+1;
                j=i;
            }
        }
        swapFunction(sb,i,j-1);
        System.out.println(sb);
    }
    static void toggleString(StringBuilder sb){
        for(int i=0; i<sb.length(); i++){
            char ch = sb.charAt(i);
            int ascii = (int)ch;
            if(ascii>64 && ascii<=90) ascii+=32;
            else ascii -=32;
            ch = (char)ascii;
            sb.setCharAt(i,ch);
        }
        System.out.println(sb);
    }
    static void evenIdxChange(String str){
        String str2 = "";
        for(int i=0; i<str.length(); i++){
            if(i%2 == 0) str2 = str2 + 'a';
            else str2 += str.charAt(i);
        }
        System.out.println(str2);
    }
    static int numberOfDigit(int n){
        String str = Integer.toString(n);
        return str.length();
    }
    static void subString(String str){
        for(int i=0; i<str.length(); i++){
            for(int j=i+1; j<str.length()+1; j++){
                System.out.print(str.substring(i,j)+"\t");
            }
            System.out.println();
        }
        System.out.println();
    }
    static int vowelCount(String str){
        int count=0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == 'a' || str.charAt(i)=='A') count++;
            else if(str.charAt(i) == 'e' || str.charAt(i)=='E') count++;
            else if(str.charAt(i) == 'i' || str.charAt(i)=='I') count++;
            else if(str.charAt(i) == 'o' || str.charAt(i)=='O') count++;
            else if(str.charAt(i) == 'u' || str.charAt(i)=='U') count++;
        }
        return count;
    }
    public static void main(String[] args){
        String[] st ={"084","904754","405754"};
        System.out.println(maxValue(st));
    }
}