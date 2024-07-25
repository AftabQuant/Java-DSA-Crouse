package ARRAY;
public class MaximumElement{
    static int maxEle(int[] arr, int idx){
        if(idx == arr.length-1) return arr[idx];
        int sele = maxEle(arr,idx+1);
        if(arr[idx]>sele)  return arr[idx];
        else    return sele;
    }
    public static void main(String[] args) {
        int[] arr = {3,10,3,20,5};
        System.out.println(maxEle(arr,0));
    }
}
