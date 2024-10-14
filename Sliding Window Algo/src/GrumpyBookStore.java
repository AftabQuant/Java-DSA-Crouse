public class GrumpyBookStore{
    public static int maxSatisfied(int[] arr, int[] brr, int k){
        int n = arr.length;
        int i=0, j=k-1, maxUnsatisfied = 0, sum = 0; int a = i, b = j;
        for(int x = 0; x<k; x++){
            if(brr[x] == 1){
                sum += arr[x];
            }
        }
        while(j<n){
            if(maxUnsatisfied < sum){
                maxUnsatisfied = sum;
                a = i; b = j;
            }
            i++; j++;
            if(j<n && brr[j] == 1) sum +=arr[j];
            if(j<n && brr[i-1] == 1) sum -=arr[i-1];
        }
        int satisfied = 0;
        for(int x =a; x<=b; x++){
            brr[x] = 0;
        }
        for(int x=0; x<arr.length; x++){
            if(brr[x] == 0) satisfied +=arr[x];
        }
        return satisfied;
    }
    public static int MaxSatisfied(int[] arr, int[] brr, int k){
        int n = arr.length;
        int i=0, j=k-1, maxUnsatisfied = 0, sum = 0; int a = i, b = j;
        for(int x = 0; x<k; x++){
            if(brr[x] == 1){
                sum += arr[x];
            }
        }
        maxUnsatisfied = Math.max(sum, maxUnsatisfied);
        a = i; b = j;
        i++; j++;
        while(j<n){
            if(brr[j] == 1){
                sum = sum - arr[i-1] + arr[j];
                maxUnsatisfied = Math.max(sum, maxUnsatisfied);
                a = i; b = j;
            }
            i++;j++;
        }
        int satisfied = 0;
        for(int x =a; x<=b; x++){
            brr[x] = 0;
        }
        for(int x=0; x<arr.length; x++){
            if(brr[x] == 0) satisfied +=arr[x];
        }
        return satisfied;
    }
    public static void main(String[] args) {

    }
}
