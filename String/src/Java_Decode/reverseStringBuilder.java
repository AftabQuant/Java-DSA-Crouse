package Java_Decode;

public class reverseStringBuilder{
    static void swapfunc(StringBuilder sb, int i, int j){
        while(i<=j){
            char temp = sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j,temp);
            i++;j--;
        }
    }
    public static void main(String[] args) {
        String str = "i am md aftab";
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb);
        int i=0; int j=0;
        while(j<sb.length()){
            if(sb.charAt(j)!=' ') j++;
            else {
                swapfunc(sb,i,j-1);
                i = j+1;
                j = i;
            }
        }
        swapfunc(sb,i,j-1);
        System.out.println(sb);
    }
}
