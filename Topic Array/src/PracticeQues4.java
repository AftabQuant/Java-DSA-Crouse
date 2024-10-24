import java.util.Scanner;

public class PracticeQues4{
    static void printArray(int[] arr){
        for(int ele : arr){
            System.out.print(ele+"\t");
        }
        System.out.println();
    }
    static void swapFunc(int[] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    static int[] doublet(int[] arr, int x){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]+arr[j] == x){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {1,1};
    }
    static void reverseArray(int[] arr){
        int lo= 0, hi= arr.length-1;
        while(lo<=hi){
            swapFunc(arr,lo,hi);
            lo++;hi--;
        }
        printArray(arr);
    }
    static void sort0and1(int[] arr){
        int lo = 0, hi = arr.length-1;
        while(lo<=hi){
            if(arr[lo]==1 && arr[hi]==0){
                swapFunc(arr,lo,hi);
                lo++;hi--;
            }
            else if(arr[lo]==0) lo++;
            else if(arr[hi]==1) hi--;
        }
        printArray(arr);
    }
    static void sort0and1and2(int[] arr){
        int lo = 0, hi = arr.length-1;
        int mid=0;
        while(mid<=hi){
            if(arr[mid]==0){
                swapFunc(arr,mid,lo);
                lo++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else if(arr[mid]==2){
                swapFunc(arr,mid,hi);
                hi--;
            }
        }
        printArray(arr);
    }
    static void sortOddAndEven(int[] arr){
        int n = arr.length;
        int lo =0, hi =n-1;
        while(lo<=hi){
            if(arr[lo]%2!=0 && arr[hi]%2 == 0){
                swapFunc(arr,lo,hi);
                lo++;hi--;
            }
            else if(arr[lo]%2==0) lo++;
            else hi--;
        }
        printArray(arr);
    }
    static int[] mergeSortedArray(int[] arr, int[] brr){
        int[] crr = new int[arr.length+brr.length];
        int i=0,j=0,k=0;
        while(i<arr.length && j<brr.length){
            if(arr[i]<=brr[j]) crr[k++] = arr[i++];
            else crr[k++] = brr[j++];
        }
        while(i< arr.length) crr[k++] = arr[i++];
        while(j<brr.length) crr[k++] = brr[j++];
        return crr;
    }
    static int[] nextGreatestElement(int[] arr){
        int[] ans = new int[arr.length];
        int n = arr.length;
        ans[n-1] = -1;
        int nge = arr[n-1];
        for(int i=n-2; i>=0;i--){
            ans[i] = nge;
            nge = Math.max(nge,arr[i]);
        }
        return ans;
    }
    static void prefixSum(int[] arr){
        for(int i=1; i<arr.length; i++){
            arr[i] += arr[i-1];
        }
        printArray(arr);
    }
    static int queriesPrefixSum(int[] arr, int l, int r){
        int n = arr.length;
        int sum = 0;
        for(int i=l;i<r;i++){
            sum+=arr[i];
        }
        return sum;
    }
    static boolean equalSubArray(int[] arr){
        int n = arr.length;
        int sum = 0;
        int prefixSum =0;
        for(int i=0; i<n; i++) sum+=arr[i];
        for(int i=0; i<n; i++){
            prefixSum +=arr[i];
            int suffixSum = sum-prefixSum;
            if(prefixSum==suffixSum)return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,3,5,6,2,1};
        System.out.println(equalSubArray(arr));
    }
}
