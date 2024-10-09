import java.util.*;

public class PracticeQues2 {
    static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+"\t");
        }
        return;
    }
    static int sumOfArray(int[] arr){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        return sum;
    }
    static int searchElement(int[] arr,int x){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
    }
    static int maxOfArray(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
    static int countEle(int[] arr,int x){
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == x) {
                count++;
            }
        }
        return count;
    }
    static int lastOccarence(int[] arr, int x){
        int ans= -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == x){
                ans = i;
            }
        }
        return ans;
    }
    static void sortNegandPos(int[] arr){
        int i=0,j=arr.length-1,temp;
        while(i<j){
            if(arr[i]>0 && arr[j]<0){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            if(arr[i]<0){
                i++;
            }
            if(arr[j]>0){
                j--;
            }
        }
    }
    static int targerSum(int[] arr, int x){
        int count=0;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                if(arr[i]+arr[j] == x){
                    count++;
                }
            }
        }
        return count;
    }
    static void sortOddAndEven(int[] arr){
        int i=0,j=arr.length-1;
        while(i<j){
            if(arr[i]%2==0 && arr[j]%2!=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            if(arr[i]%2 != 0){
                i++;
            }
            if(arr[j]%2 == 0){
                j--;
            }
        }
    }
    static void prefixSum(int[] arr){
        for(int i=1;i<arr.length; i++){
            arr[i] = arr[i] + arr[i-1];
        }
    }
    static void sToEnd(int[] arr, int s, int e){
        for(int i=s;i<=e;i++){
            arr[i] = arr[i] + arr[i-1];
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the searching element: ");
        int s = sc.nextInt();
        System.out.println("Enter the searching element: ");
        int e = sc.nextInt();
        sToEnd(arr,s,e);
        printArray(arr);
    }
}


