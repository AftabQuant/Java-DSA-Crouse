package Java_Decode;

import java.util.Scanner;

public class interning {
    public static void main(String[] args) {
//      String str =  "Hello";
//        str = str.substring(0,2)+'y'+str.substring(3);
//      System.out.println(str);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.nextLine();
        String s = "";
        for(int i=0; i<str.length(); i++){
            if(i%2 == 0) s +='a';
            else s += str.charAt(i);
        }
        System.out.println(s);
    }
}
