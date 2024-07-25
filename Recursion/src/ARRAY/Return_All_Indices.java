package ARRAY;
public class Return_All_Indices{
    static void search(int[] arr, int x, int idx){
        if(idx==arr.length) return;
        if(arr[idx] == x) System.out.print(idx+"\t");
        search(arr,x,idx+1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,2,5};
        search(arr,2,0);
        System.out.println();
        int[] brr = {8,8,8};
        search(brr,8,0);
    }
}
