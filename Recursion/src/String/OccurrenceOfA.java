package String;

public class OccurrenceOfA {
    static String removeA(String st, int idx){
        if(idx==st.length()) return " ";
        String ans = removeA(st,idx+1);
        char cidx = st.charAt(idx);
        if(cidx != 'a'){
            return cidx + ans;
        }
        else return ans;
    }
    public static void main(String[] args) {
        String st = "abcax";
        System.out.println(removeA(st,0));
    }
}
