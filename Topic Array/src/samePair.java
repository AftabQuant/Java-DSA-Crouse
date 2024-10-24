import java.util.Scanner;

public class samePair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[]{0,1,2,3,4,5,6,0};
        int count = 0;
        System.out.println("Enter number: ");
        int x =sc.nextInt();
        int freq[] = new int[10];
        for(int i =0; i<arr.length; i++){
            if(arr[i] == x) {
                freq[arr[i]]++;
                count++;
            }
        }
        if(freq[x] >0) {
            System.out.println(count);
        }
    }
}
