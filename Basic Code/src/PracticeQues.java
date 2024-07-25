import java.util.*;

public class PracticeQues {
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        return;
    }

    static int sumofArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    static int searchEle(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    static int MaxOfArray(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    static int countoccarences(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        return count;
    }

    static int lastOcarence(int[] arr, int x) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                ans = i;
            }
        }
        return ans;
    }

    static int[] sortNegAndPos(int[] arr) {
        int[] ans = new int[arr.length];
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                ans[idx] = arr[i];
                idx++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                ans[idx] = arr[i];
                idx++;
            }
        }
        return ans;
    }

    static int targetSum(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == x) {
                    count++;
                }
            }
        }
        return count;
    }

    static int uniqueNum(int[] arr) {
        int[] freq = new int[10];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (freq[i] == 1) {
                return i;
            }
        }
        return -1;
    }

    static int secondLargest(int[] arr) {
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                smax = max;
                max = arr[i];
            } else if (smax < arr[i] && max != arr[i]) {
                smax = arr[i];
            }
        }
        return smax;
    }

    static void reverseArray(int[] arr) {
        int i = 0, j = (arr.length - 1);
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    static int repeatedEle(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }
    static void rotateArray(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    static int[] presentElem(int[] arr) {
        int[] freq = new int[100];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        return freq;
    }
    static void sortZeroAndOne(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            if (arr[i] == 1 && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            if (arr[i] == 0) {
                i++;
            }
            if (arr[j] == 1) {
                j--;
            }
        }
    }
    static void sortOddAndEven(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            if (arr[i] % 2 != 0 && arr[j] % 2 == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            if (arr[i] % 2 == 0) {
                i++;
            }
            if (arr[j] % 2 != 0) {
                j--;
            }
        }
    }
    static int[] increasingOrder(int[] arr){
        int i=0, j = arr.length-1;
        int[] ans = new int[arr.length];
        int k=0;
        while(i<=j){
            if(Math.abs(arr[i]) > Math.abs(arr[j])){
                ans[k++] = arr[i]*arr[i];
                i++;
            }
            else{
                ans[k++] = arr[j] * arr[j];
                j--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
//        System.out.print("Enter the element : ");
//        int x = sc.nextInt();
    }
}
