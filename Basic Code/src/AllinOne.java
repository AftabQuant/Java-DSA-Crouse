import java.util.Scanner;

public class AllinOne {
    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    static void reverseArray(int arr[]) {
        int i = 0, j = (arr.length - 1);
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }


    static int countOcca(int arr[], int k) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > k) {
                count++;
            }
        }
        return count;
    }


    static boolean sortedArray(int[] arr) {
        boolean flag = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    static int pairOfsum(int arr[], int k) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == k) {
                    count++;
                }
            }
        }
        return count;
    }

    static int uniqueArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                ans = arr[i];
            }
        }
        return ans;
    }

    static int secondMax(int arr[]) {
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

    static int repeatingEle(int arr[]) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }

    static void rotateArray(int arr[], int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    static int[] frequencyArray(int arr[]) {
        int n = arr.length;
        int freq[] = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        return freq;
    }

    static int frequencyarray(int arr[]) {
        int n = arr.length;
        int ans = 0;
        int freq[] = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (freq[i] == 1) {
                ans = i;
                return ans;
            }
        }
        return -1;
    }

    static void zeroAndOneNormal(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (i < count) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
    }

    static int[] sortZeroAndOne(int arr[]) {
        int i = 0, j = (arr.length - 1);
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
        return arr;
    }

    static int[] sortOddAndEven(int arr[]) {
        int i = 0, j = (arr.length - 1);
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
        return arr;
    }

    static int[] sortsquare(int arr[]) {
        int n = arr.length;
        int i = 0, j = (n - 1);
        int aar[] = new int[n];
        int k = 0;
        while (i <= j) {
            if (Math.abs(arr[i]) > Math.abs(arr[j])) {
                aar[k++] = arr[i] * arr[i];
                i++;
            } else {
                aar[k++] = arr[j] * arr[j];
                j--;
            }
        }
        return aar;
    }

    static int[] prefixSum(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i] + arr[i - 1];
        }
        return arr;
    }

    static int[] suffixSum(int arr[]) {
        int n = arr.length;
        for (int i = n - 2; i >= 0; i--) {
            arr[i] = arr[i] + arr[i + 1];
        }
        return arr;
    }

    static int[] rangesum(int arr[]) {
        int n=arr.length;
        for (int i = 1; i <n; i++) {
            arr[i] = arr[i] + arr[i - 1];
        }
        return arr;
    }

    static int totalSum(int arr[]){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum +=arr[i];
        }
        return sum;
    }

    static boolean subArray(int arr[]){
        int total=totalSum(arr);
        int preSum = 0;
        int sSum=0;
        for(int i=0; i<arr.length; i++){
            preSum +=arr[i];
            int suffix = total - preSum;
            if(preSum == suffix){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = sc.nextInt();
        int arr[] = new int[n+1];
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
//        System.out.print("Enter q: ");
//        int q = sc.nextInt();
//        int sum=0;
//        int freq[] = rangesum(arr);
//        while (q-- > 0) {
//            System.out.print("Enter l: ");
//            int l = sc.nextInt();
//            System.out.print("Enter r: ");
//            int r = sc.nextInt();
//            sum = freq[r]-freq[l-1];
//            System.out.print("Ans is : "+sum);
//        }
        sortOddAndEven(arr);
        printArray(arr);
    }
}

