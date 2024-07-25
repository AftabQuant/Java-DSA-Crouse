import java.util.Scanner;

public class sumOfTwoNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter element: ");
        int count = 0;
        int x = sc.nextInt();
        System.out.println("Enter size: ");
        int num = sc.nextInt();
        int arr[] = new int[num];
        for(int i=0;i< arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == x) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
