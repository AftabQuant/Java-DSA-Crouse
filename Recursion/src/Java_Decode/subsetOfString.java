package Java_Decode;

import java.util.ArrayList;

public class subsetOfString{
    static ArrayList<String> arr = new ArrayList<>();
    static void subsetByTraversal(String str){
        for(int i=0; i<str.length(); i++){
            for(int j=i+1; j<str.length(); j++){
                System.out.println(str.substring(j));
            }
        }
        System.out.println();
    }
    static void subsetByRecursion(String str, int idx, String res){
        if(idx == str.length()){
            arr.add(res);
            return;
        }
        char ch = str.charAt(idx);
        subsetByRecursion(str,idx+1,res);
        subsetByRecursion(str,idx+1,res+ch);
    }
    public static void main(String[] args) {
       String str = "abc";
       arr = new ArrayList<>();
       subsetByRecursion(str,0,"");
        System.out.println(arr);
    }
}
