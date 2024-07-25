package Java_Decode;

import java.awt.desktop.ScreenSleepEvent;
import java.util.Scanner;

public class preInpost {
    static void pip(int n){
        if(n==0) return;
        System.out.print(n+""); // pre
        pip(n-1);
        System.out.print(n+""); // in
        pip(n-1);
        System.out.print(n+""); // post
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        pip(n);
    }
}
