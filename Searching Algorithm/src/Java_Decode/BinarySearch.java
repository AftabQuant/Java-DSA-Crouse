package Java_Decode;

import java.util.Arrays;

public class BinarySearch{
    static void printEle(int[] res){
        for(int ele : res){
            System.out.println(ele);
        }
        System.out.println();
    }
    static int[] firstLast(int[] arr, int x){
        int n = arr.length;
        int st =0, end = n-1;
        int ans = -1;
        int ans2 = -1;
        boolean flag = false;
        while(st<=end){
            int mid = st+(end-st)/2;
            if(arr[mid]==x){
                ans = mid;
                end = mid-1;
                flag = true;
            }
            else if(arr[mid]<x){
                st = mid+1;
            }
            else end = mid-1;
        }
        st =0; end = n-1;
        while(st<=end){
            int mid = st+(end-st)/2;
            if(arr[mid]==x){
                ans2 = mid;
                st = mid+1;
            }
            else if(arr[mid]<x){
                st = mid+1;
            }
            else end = mid-1;
        }
        int[] anns = {-1,-1};
        if(flag){
            return new int[]{ans,ans2};
        }
        else return anns;
    }
    static int lowerBound(int[] arr, int x){
        int n = arr.length;
        int lb = n;
        int st =0, end = n-1;
        while(st<=end){
            int mid = st+(end-st)/2;
            if(arr[mid]>=x){
                lb = Math.min(mid,lb);
                end = mid-1;
            }
            else st = mid+1;
        }
        return lb;
    }
    static int upperBound(int[] arr, int x){
        int n = arr.length;
        int ub = n;
        int st =0, end = n-1;
        while(st<=end){
            int mid = st+(end-st)/2;
            if(arr[mid]>x){
                ub = Math.min(mid,ub);
                end = mid-1;
            }
            else st = mid+1;
        }
        return ub;
    }
    static boolean binarySearch(int[] arr, int target){
        int n = arr.length;
        int low = 0, high = n-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid] == target) return true;
            else if(arr[mid]>target){
                high = mid-1;
            }
            else low = mid+1;
        }
        return false;
    }
    static int sqrt(int x){
        int st = 0, end = x;
        int ans = -1;
        while(st<=end){
            int mid = st + (end-st)/2;
            ans = mid*mid;
            if(ans==x) return mid;
            else if(ans<x){
                ans = mid;
                st = mid+1;
            }
            else end = mid-1;
        }
        return ans;
    }
    static int rotatedArray(int[] arr, int x){
        int n = arr.length;
        int st =0, end = n-1;
        while(st<=end){
            int mid = st + (end-st)/2;
            if(arr[mid]==x) return mid;
            else if(arr[mid]>=arr[end]){
                if(arr[st]<=x && arr[mid]>=x) end = mid-1;
                else st = mid+1;
            }
            else{
                if(arr[mid]<=x && arr[end]>=x) st = mid+1;
                else end = mid-1;
            }
        }
        return -1;
    }
    static int[] closetElement(int[] arr, int k, int x){
        int n = arr.length;
        int[] ans = new int[k];
        int idx = 0;
        if(x<arr[0]){
            for(int i=0; i<k; i++){
                ans[idx++] = arr[i];
            }
        }
        if(x>arr[n-1]){
            for(int i=n-1; i>=n-k; i--){
                ans[idx++] = arr[i];
            }
        }
        int st = 0, end = n-1;
        int lb = n;
        while(st<=end){
            int mid = st+(end-st)/2;
            if(arr[mid]>=x){
                lb = mid;
                end = mid-1;
            }
            else st = mid+1;
        }
        int i = lb-1, j = lb;
        while(k>0 && i>=0 && j<n){
            int li = Math.abs(lb-arr[i]);
            int lj = Math.abs(lb-arr[j]);
            if(li<=lj){
                ans[idx++] = arr[i];
                i--;
            }
            else {
                ans[idx++] = arr[j];
                j++;
            }
            k--;
        }
        while(i<0 && k>0){
            ans[idx++] = arr[j];
            j++;
            k--;
        }
        while(j==n && k>0){
            ans[idx++] = arr[i];
            i--;
            k--;
        }
        Arrays.sort(ans);
        return ans;
    }
    static int shipWithinDays(int[] arr, int days){
        int n = arr.length;
        int mx = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0; i<n; i++){
            mx = Math.max(mx,arr[i]);
            sum +=arr[i];
        }
        int lo = mx, hi = sum, minC =0;
        while(lo<=hi){
            int mid = lo +(hi-lo)/2;
            if(isPossible(mid,arr,days)){
                minC = mid;
                hi = mid-1;
            }
            else lo = mid+1;
        }
        return minC;
    }
    static boolean isPossible(int mid, int[] arr, int days){
        int n = arr.length;
        int load = 0;
        for(int i=0; i<n; i++){
            if(load+arr[i]<=mid) load +=arr[i];
            else{
                load = arr[i];
                days--;
            }
        }
        if(days<=0) return false;
        else return true;
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int[] arr2 = {1,2,3,1,1};
        int ans = shipWithinDays(arr2,4);
        System.out.println(ans);
    }
}
