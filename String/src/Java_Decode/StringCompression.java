package Java_Decode;

public class StringCompression{
    public static void main(String[] args) {
        String str = "aaaandddddjjjjkiii";
        char[] ch = str.toCharArray();
        String ans = "";
        int i=0, j=0;
        while(j<ch.length){
            if(ch[i] == ch[j]) j++;
            else{
                ans += ch[i];
                int len = j-i;
                if(len>1) ans +=len;
                i=j;
            }
        }
        ans +=ch[i];
        int len = j-i;
        if(len>1) ans+= len;
        System.out.println(ans);
    }
}
