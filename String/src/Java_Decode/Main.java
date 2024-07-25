package Java_Decode;
import java.util.*;
import java.util.stream.StreamSupport;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String str = sc.nextLine();
        System.out.println("Hi "+str);
        System.out.println(str.length());
        System.out.println(str.indexOf('A'));
        String s = "abc";
        String c = "dbc";
        System.out.println(s.compareTo(c));
        String a = "Physics Wallah";
        System.out.println(a.toUpperCase());
        System.out.println(s.concat(c));
        String str1 = "abcd";
        System.out.println(str1.substring(1));
    }
}
