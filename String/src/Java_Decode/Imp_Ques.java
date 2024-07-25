package Java_Decode;

import java.util.Arrays;

public class Imp_Ques{
    static String compressString(String st){
        int i =0,j=0;
        String ans = "";
        while(j<st.length()){
            if(st.charAt(i)==st.charAt(j)) j++;
            else if(st.charAt(i)!=st.charAt(j)){
                ans += st.charAt(i);
                if((j-i)>1) ans+=(j-i);
                i = j;
                j = j+1;
            }
        }
        ans+=st.charAt(i);
        if((j-i)>1) ans+=(j-i);
        return ans;
    }
    static boolean isIsomorphic(String s,String t){
        char[] a = new char[128];
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            char dh = t.charAt(i);
            int idx = (int)ch;
            if(a[idx]=='\0') a[idx] = dh;
            else{
                if(a[idx]!=dh) return false;
            }
        }
        char[] b = new char[128];
        for(int i=0; i<t.length(); i++){
            char ch = s.charAt(i);
            char dh = t.charAt(i);
            int idx = (int)dh;
            if(b[idx]=='\0') b[idx] = ch;
            else{
                if(b[idx]!=ch) return false;
            }
        }
        return true;
    }
    static void maxOccurrence(String st){
        int[] arr = new int[26];
        for(int i=0; i<st.length(); i++){
            char temp = st.charAt(i);
            int idx = (int)temp -97;
            arr[idx]++;
        }
        int mx = arr[0];
        for(int i=1; i<arr.length; i++){
            mx = Math.max(mx,arr[i]);
        }
        char ans;
        for(int i=0; i<arr.length; i++){
            if(mx == arr[i]){
                ans = (char)(i+97);
                System.out.print(ans+"\t");
            }
        }

    }
    static boolean isAnagram(String s, String t){
        char[] ch = s.toCharArray();
        char[] dh = t.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(dh);
        for(int i=0; i<ch.length; i++){
            if(ch[i]!=dh[i]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String ans = compressString("aaaabbhcccddd");
        System.out.println(ans);
    }
}
