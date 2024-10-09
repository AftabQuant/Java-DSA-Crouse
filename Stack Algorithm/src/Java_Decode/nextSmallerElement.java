package Java_Decode;

import java.util.Stack;

public class nextSmallerElement{
    public static void main(String[] args) {
        int[] arr = {10,4,2,20,40,12,30};
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] nse = new int[n];
        nse[n-1] = -1;
        st.push(arr[n-1]);
        for(int i=n-2; i>=0; i--){
            while(!st.isEmpty() && st.peek() >= arr[i]) st.pop();
            if(st.isEmpty()) nse[i] = -1;
            else nse[i] = st.peek();
            st.push(arr[i]);
        }
        for(int ele:nse){
            System.out.print(ele+" ");
        }
    }
}
