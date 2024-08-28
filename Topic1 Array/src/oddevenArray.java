public class oddevenArray {
    static void oddArray(int arr[]){
        int i =0;
        int j=arr.length-1;
        while (i<j){
            if(arr[i]%2 != 0 && arr[j]%2==0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            if(arr[i]%2 == 0){
                i++;
            }
            if(arr[j]%2 != 0){
                j--;
            }
        }
    }
    static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
          int arr[] = new int[]{1,2,3,4,5,6,7};
          oddArray(arr);
          printArray(arr);
    }
}
