package Questions;

import java.util.Scanner;

public class ReverseString{
    static String reverseString(String s){
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your String : ");
        String st = sc.nextLine();
        System.out.println(reverseString(st));
    }
}
