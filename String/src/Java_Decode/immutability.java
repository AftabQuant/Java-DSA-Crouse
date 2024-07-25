package Java_Decode;
public class immutability {
    public static void main(String[] args) {
        String str = "aftab";
        for(int i=0; i<=str.length(); i++){
           for(int j=i+1; j<=str.length(); j++){
               System.out.print(str.substring(i,j)+"\t");
           }
            System.out.println();
        }
        System.out.println(str.charAt(0));
        System.out.println();
    }
}
