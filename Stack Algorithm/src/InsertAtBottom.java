import java.util.*;

public class InsertAtBottom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        System.out.print("Enter the size: ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.println(st);
        System.out.print("Enter insert's element : ");
        int in = sc.nextInt();
        Stack<Integer> rt = new Stack<>();
        while(st.size()>0){
            rt.push(st.pop());
        }
        rt.push(in);
        while ((rt.size()>0)) {
            st.push(rt.pop());
        }
        System.out.println(st);
    }
}
