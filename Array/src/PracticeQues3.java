import java.util.*;
public class PracticeQues3 {
    static void display(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
    }
    static int calculateSum(int[] arr){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        return sum;
    }
    static int maxElement(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
    static int minElement(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
    static boolean presentEle(int[] arr, int ele){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==ele){
                return true;
            }
        }
        return false;
    }
    static int occurence(int[] arr,int x){
        int count = 0;
        for(int i=0; i< arr.length; i++){
            if(arr[i] == x){
                count++;
            }
        }
        return count;
    }
    static int lastoccurence(int[] arr,int x){
        int idx = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==x){
                idx = arr[i];
            }
        }
        return idx;
    }
    static int greaterThNum(int[] arr,int x){
        int idx = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>x){
                idx++;
            }
        }
        return idx;
    }
    static int[] largestAndSmallest(int[] arr){
        Arrays.sort(arr);
        int[] ans = {arr[0] , arr[arr.length-1]};
        return ans;
    }
    static int[] kthelement(int[] arr,int k){
        Arrays.sort(arr);
        int[] ans ={arr[k-1],arr[k]};
        return ans;
    }
    static int sumofpair(int[] arr, int x){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]+arr[j]==x){
                    count++;
                }
            }
        }
        return count;
    }
    static int tripleofpair(int[] arr, int x){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                for(int k=i+2; k<arr.length; k++) {
                    if (arr[i] + arr[j] +arr[k] == x) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
    static int uniqueEle(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]!=arr[j]){
                    return arr[i];
                }
            }
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]>-1){
                return arr[i];
            }
        }
        return -1;
    }
    static int secondLargest(int[] arr){
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(max<arr[i]){
                smax = max;
                max = arr[i];
            }
            else if(smax<arr[i]&&max!=arr[i]){
                smax = arr[i];
            }
        }
        return smax;
    }
    static void reverseAr(int[] arr,int si, int ei) {
        for (int i = si, j = ei; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    static void rotateArray(int[] arr,int k){
        int n = arr.length;
        k = k%n;
        reverseAr(arr,0,n-1);
        reverseAr(arr,0,k-1);
        reverseAr(arr,k,n-1);
    }
    static int[] frequencyAr(int[] arr){
        int[] ans = new int[100];
        for(int i=0; i<arr.length; i++){
            ans[arr[i]]++;
        }
        return ans;
    }
    static void sort0and1(int[] arr){
        int i=0,j=arr.length-1;
        while(i<=j){
            if(arr[i]==1 && arr[j]==0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            else if(arr[i]==0){
                i++;
            }
            else if(arr[j]==1){
                j--;
            }
        }
    }
    static void sortOddEven(int[] arr){
        int i=0,j=arr.length-1;
        while(i<=j){
            if(arr[i]%2!=0 && arr[j]%2 == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            } else if(arr[i]%2==0){
                i++;
            }
            else if(arr[j]%2!=0){
                j--;
            }
        }
    }
    static void sortNegPos(int[] arr){
        int i=0,j=arr.length-1;
        while(i<=j){
            if(arr[i]>0 && arr[j]<0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            } else if(arr[i]<0){
                i++;
            }
            else if(arr[j]>0){
                j--;
            }
        }
    }
    static int[] sortSquare(int[] arr){
        int i=0,j=arr.length-1;
        int k=0;
        int[] ans = new int[arr.length];
        while(i<=j){
            if(Math.abs(arr[i]) > Math.abs(arr[j])){
                ans[k++] = arr[i]*arr[i];
                i++;
            }
            else {
                ans[k++] = arr[j]*arr[j];
                j--;
            }
        }
        return ans;
    }
    static int[] prefixSum(int[] arr){
        for(int i=1; i<arr.length; i++){
            arr[i] = arr[i-1]+arr[i];
        }
        return arr;
    }
    static int[] prefixxsum(int[] arr, int si, int ei){
        for(int i=si; i<=ei; i++){
            arr[i] = arr[i-1]+arr[i];
        }
        return arr;
    }
    static int repeatingEle(int[] arr){
        int ans =0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    ans = arr[i];
                    return ans;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=1; i<=n; i++) arr[i] = sc.nextInt();
        System.out.print("Enter num : ");
        int x = sc.nextInt();
        System.out.print("Enter num : ");
        int y = sc.nextInt();
        prefixxsum(arr,x,y);
        display(arr);
    }
}