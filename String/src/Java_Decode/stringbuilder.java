package Java_Decode;

public class stringbuilder{
    public static void main(String[] args) {
        String str = "aftab";
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb);
        int i=0; int j = sb.length()-1;
        while(i<=j){
            char temp = sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j,temp);
            i++;j--;
        }
        System.out.println(sb);
        StringBuilder x = new StringBuilder();
        // Append()
//        sb.append(" uddin");
//        System.out.println(sb);

        // delete charAt()
        sb.deleteCharAt(3);
        System.out.println(sb);
//        System.out.println(sb.charAt(3));
        // insert()
        sb.insert(3,"sffs");
        System.out.println(sb);
    }
}
