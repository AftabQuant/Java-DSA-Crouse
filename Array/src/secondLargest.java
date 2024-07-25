import java.util.*;

public class secondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int smax = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                smax=max;
                max = arr[i];
            } else if(smax<arr[i] && max !=arr[i]) {
                smax=arr[i];
            }
        }
        System.out.println("second largest element: " + smax);
        System.out.println("Largest element: " + max);
    }
}
