package Java_Decode;

import java.util.Scanner;

public class CountAndSay{
    static String print(int n){
        if(n==1) return "1";
        String s = print(n-1) + "0";
        String ans = "";
        int i=0,j=0;
        while(j<s.length()){
            if(s.charAt(i) == s.charAt(j)) j++;
            else{
                int len = j-i;
                ans += len;
                ans += s.charAt(i);
                i=j;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.println(print(n));
    }
}
