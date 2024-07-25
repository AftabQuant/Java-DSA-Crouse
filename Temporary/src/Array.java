import java.util.Scanner;

public class Array {
    static void printArray(int[] arr){
        for(int ele: arr){
            System.out.print(ele+"\t");
        }
        System.out.println();
    }
    static int[] twoSum(int[]arr, int x){
        for(int i=0; i<arr.length;i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]+arr[j]==x) return new int[]{i,j};
            }
        }
        return new int[] {-1,-1};
    }
    static void swapFunc(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void reverseArray(int[] arr){
        int lo=0, hi=arr.length-1;
        while(lo<=hi){
            swapFunc(arr,lo,hi);
            lo++;
            hi--;
        }
        printArray(arr);
    }
    static void rotateArray(int[] arr, int lo, int hi){
        while(lo<=hi){
            swapFunc(arr,lo,hi);
            lo++;hi--;
        }
    }
    static void sort0sAnd1s(int[] arr){
        int lo= 0, hi= arr.length-1;
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
    static void sort0sAnd1sAnd2s(int[] arr){
        int lo=0,mid=0,hi=arr.length-1;
        while(mid<=hi){
            if(arr[mid]==0){
                swapFunc(arr,lo,mid);
                lo++;mid++;
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
    public static void main(String[] args) {
        int[] arr = {10,23,98,12,87,78};
        }
    }
