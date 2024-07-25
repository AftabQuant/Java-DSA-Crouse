package Java_Decode;

import java.util.Arrays;

public class sortingString{
    public static void main(String[] args) {
        String str = "aftab";
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        for(char ele : ch){
            System.out.print(ele);
        }
        System.out.println();
        StringBuilder sb = new StringBuilder("uddin");
        String str1 = sb.toString();
        char[] arr = str1.toCharArray();
        Arrays.sort(arr);
        for(char ele : arr){
            System.out.print(ele);
        }
    }
}
