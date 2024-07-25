package Java_Decode;
import java.util.Scanner;

public class isomorphic{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str1 = sc.next();
        System.out.println("Enter a String : ");
        String str2 = sc.next();
        boolean flag = true;
        char[] freq = new char[128];
        for(int i=0; i< str1.length(); i++){
            char ch = str1.charAt(i);
            char dh = str2.charAt(i);
            int idx = (int)ch;
            if(freq[idx] == '\0') freq[idx] = dh;
            else{
                if(freq[i] != dh) flag = false;
            }
        }
        for(int i=0; i<freq.length; i++){
            if(str2.charAt(i) == freq[i]){

            }
        }
    }

}
