package Java_Decode;
public class digitOfString {
    static String purify(String s){
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) != '0') {
                return s.substring(i);
            }
        }
        return s;
    }
    static String max(String s, String t){
        String a = purify(s), b = purify(t);
        if(a.length()> b.length()) return a;
        if(a.length() < b.length()) return b;
        for(int i=0; i<a.length(); i++){
            if(a.charAt(i)> b.charAt(i)) return a;
            else return b;
        }
        if(s.length() > t.length()) return s;
        else return t;
    }
    public static void main(String[] args) {
        String[] str = {"2133244","43245","53320","9327826"};
        String maxS = str[0];
        for(int i=1; i<str.length; i++){
            maxS = max(maxS,str[i]);
        }
        System.out.println(maxS);
    }
}
