package Semester;
public class practice_a {
    static void printArray(int[] ar){
        for(int ele : ar){
            System.out.print(ele+"\t");
        }
        System.out.println();
    }
    static void swapFun(int[] ar, int x, int y){
        int temp = ar[x];
        ar[x] = ar[y];
        ar[y] = temp;
    }
    static void bubbleSort(int[] ar){
        int n = ar.length;
        for(int i=0; i<n-1; i++){
            boolean flag = false;
            for(int j=0; j<n-i-1; j++){
                if(ar[j]>ar[j+1]){
                    swapFun(ar,j,j+1);
                    flag = true;
                }
            }
            if(!flag) return;
        }
    }
    static void selectionSort(int[] ar){
        int n = ar.length;
        for(int i=0; i<n-1; i++){
            int min = i;
            for(int j=i+1; j<n; j++){
                if(ar[min]>ar[j]){
                    min = j;
                }
            }
            swapFun(ar,min,i);
        }
    }
    static void insertionSort(int[] ar){
        int n= ar.length;
        for(int i=0; i<n; i++){
            for(int j=i; j>0; j--){
                if(ar[j]<ar[j-1]){
                    swapFun(ar,j,j-1);
                }
            }
        }
    }
    static int partition(int[] ar, int l, int r){
        int pivot = ar[0];
        int count = 0;
        for(int i=0; i<ar.length; i++){
            if(pivot>ar[i]){
                count++;
            }
        }
        int pidx = count+l;
        swapFun(ar,l,pidx);
        int i=l,j=r;
        while(i<pidx && j>pidx){
            while(ar[i]<=pivot) i++;
            while(ar[j]>pivot) j--;
            if(i<j){
                swapFun(ar,i,j);
            }
        }
        return pidx;
    }
    static void quickSort(int[] ar,int st, int end){
        if(st<=end){
            int pi = partition(ar,st,end);
            quickSort(ar,st,pi-1);
            quickSort(ar,pi+1,end);

        }
    }
    static void merge(int[] a, int l, int mid, int r){
        int n1 = mid+1-l;
        int n2 = r-mid;
        int[] left = new int[n1];
        int[] right = new int[n2];
        int i,j,k;
        for(i=0; i<n1; i++) left[i] = a[l+i];
        for(j=0; j<n2; j++) right[j] = a[j+mid+1];
        i=0;
        j=0;
        k=l;
        while(i<n1 && j<n2){
            if(left[i]<right[j]) a[k++] = left[i++];
            else a[k++] = right[j++];
        }
        while(i<n1){
            a[k++] = left[i++];
        }
        while(j<n2){
            a[k++] = right[j++];
        }
    }
    static void mergeSort(int[] ar, int l, int r){
        if(l>=r) return;
        int mid = (l+r)/2;
        mergeSort(ar,l,mid);
        mergeSort(ar,mid+1,r);
        merge(ar,l,mid,r);
    }
    public static void main(String[] args) {
        int[] ar = {2,4,3,5,1,6};
        mergeSort(ar,0,ar.length-1);
        printArray(ar);
    }
}
