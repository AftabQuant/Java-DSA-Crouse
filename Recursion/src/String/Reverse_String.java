package String;
public class Reverse_String{
    static void reverse(String st, int idx){
        if(idx == st.length()) return ;
        reverse(st,idx+1);
        System.out.print(st.charAt(idx));
    }
    public static void main(String[] args) {
        String st = "abcdefgh";
        reverse(st,0);
    }
}
