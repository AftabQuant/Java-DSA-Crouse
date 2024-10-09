import java.util.*;
public class CopyElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the num of ele: ");
        n = sc.nextInt();
        Stack<Integer> st = new Stack<>();
        for(int i=1;i<=n;i++){
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.println(st);
        Stack<Integer> rt = new Stack<>();
        while(st.size()>0){
            int x = st.peek();
            rt.push(x);
            st.pop();
//            rt.push(st.pop());
        }
        System.out.println(rt);
        Stack<Integer> gt = new Stack<>();
        while (rt.size()>0){
            gt.push(rt.pop());
        }
        System.out.println(gt);
    }
}
