import java.util.Scanner;
class findNumber{
    int count = 0;
    int count(int a[] , int n){
        for(int i=0; i<a.length; i++){
            if(n == a[i]){
                count++;
            }
        }
        return count;
    }
}
public class CountNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        findNumber obj = new findNumber();
        System.out.print("Enter the number: ");
        int x = sc.nextInt();
        int arr[] = new int[6];
        int count = 0;
        for(int i=0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The count is: " +obj.count(arr,x));
    }
}
