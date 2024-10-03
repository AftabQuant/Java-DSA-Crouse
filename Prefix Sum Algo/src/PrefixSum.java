public class PrefixSum{
    public static void main(String[] args){
        int[] arr = {5,1,8,2,4,3,2};
        int[] res = new int[arr.length];
        res[0] = arr[0];
        for(int i=1; i<arr.length; i++){
            res[i] = arr[i] + res[i-1];
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        for(int ele : res){
            System.out.print(ele+" ");
        }
    }
}
