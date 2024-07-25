package Rotated_Array;
public class Target_Idx{
    static int Find_Element(int[] arr, int x){
        int n = arr.length;
        int st = 0, end = n-1;
        while(st<=end){
            int mid = st + (end-st)/2;
            if(arr[mid] == x) return mid;
            else if(arr[mid]<arr[end]){
                if(arr[mid]<x && arr[end]>=x){
                    st = mid+1;
                }
                else end = mid-1;
            }
            else{
                if(arr[st]<x && arr[mid]>x){
                    end = mid-1;
                }
                else{
                    st = mid+1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        int x = 1;
        System.out.println(Find_Element(arr,x));
    }
}
