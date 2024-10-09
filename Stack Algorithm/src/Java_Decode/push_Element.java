package Java_Decode;
import java.util.Scanner;
import java.util.Stack;

public class push_Element{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        System.out.println("Enter the size : ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.println("Enter the insert element : ");
        int ele = sc.nextInt();
        System.out.println("Enter the position : ");
        int pos = sc.nextInt();
        System.out.println(st);
        Stack<Integer> gt = new Stack<>();
        for(int i=1; i<=n-pos; i++){
            gt.push(st.pop());
        }
        st.push(ele);
        while(!gt.empty()){
            st.push(gt.pop());
        }
        System.out.println(st);
    }
}
