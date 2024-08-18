package Java_Decode;

public class SubArray{
    static void print(int[] arr, int size, int st, int end){
        if(size==end) return;
        for(int i=st; i<=end; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        print(arr,size,st,end+1);
    }
    static void recursion(int[] arr, int size, int st, int end){
        if(size==end) return;
        for(int i=st; i<=end; i++){
            end = st;
            print(arr,size,st,end);
        }
        recursion(arr,size,st+1,end+1);
    }
    static void printSub(int[] arr, int size, int st, int end){
        if(size==end) return;
        for(int i=st; i<=end; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        print(arr,size,st,end+1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        recursion(arr,arr.length, 0,0);
    }
}
