package Question;
import java.util.Scanner;
import java.util.Stack;
public class DisplayUsingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        Stack<Integer> gt = new Stack<>();
        while(st.size()>0){
            gt.push(st.pop());
        }
        while(gt.size()>0){
            int x = gt.pop();
            System.out.print(x+"\t");
            st.push(x);
        }
        System.out.println();
        int n = st.size();
        int[] arr = new int[n];
        for(int i=n-1;i>=0;i--){
            arr[i] = st.pop();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
    }
}
