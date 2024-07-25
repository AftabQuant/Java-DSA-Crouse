package String;

import java.util.Scanner;

public class Basics{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        System.out.println(st);
        String s = "Md Aftab Uddin";
        System.out.println(s);
        for(int i=0; i< s.length(); i++){
            System.out.print(s.charAt(i)+"\t");
        }
        System.out.println(s.length());
        System.out.println(st.substring(2,6));
    }
}
