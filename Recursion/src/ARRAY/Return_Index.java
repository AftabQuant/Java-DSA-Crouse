package ARRAY;
public class Return_Index{
    static int linear_search(int[] arr, int x, int idx){
        if(idx==arr.length) return -1;
        if(arr[idx] == x) return idx;
        return linear_search(arr,x,idx+1);
    }
    public static void main(String[] args) {
        int[] arr = {4,12,54,14,3,8,6,1};
        System.out.println(linear_search(arr,14,0));
    }
}
