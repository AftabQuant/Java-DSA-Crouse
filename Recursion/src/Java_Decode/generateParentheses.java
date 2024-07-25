package Java_Decode;

import java.util.ArrayList;
import java.util.Scanner;

public class generateParentheses{
    static ArrayList<String> arr = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        arr = new ArrayList<>();
        printString(0,0,"",n);
        System.out.println(arr);
    }
    static void printString(int open, int close, String s, int n){
        int m = s.length();
        if(m == 2*n){
            arr.add(s);
            return ; }
        if(open<n) printString(open+1,close,s+'(',n);
        if(close<open) printString(open,close+1,s+')',n);
        }
}
