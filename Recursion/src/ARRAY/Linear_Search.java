package ARRAY;
public class Linear_Search{
    static boolean linear_search(int[] arr, int x, int idx){
        if(idx==arr.length) return false;
        if(arr[idx]==x) return true;
        return linear_search(arr,x,idx+1);
    }
    public static void main(String[] args) {
        int[] arr = {4,12,54,14,3,8,6,1};
        System.out.println(linear_search(arr,141,0));
    }
}
