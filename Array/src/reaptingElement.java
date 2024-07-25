import java.util.Scanner;

public class reaptingElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[]{2, 5, 3, 4};
        int count = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
