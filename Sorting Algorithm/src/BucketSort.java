import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {
//    static void bucketSort(int[] arr){
//        int n = arr.length;
//        ArrayList<Integer>[] buckets = new ArrayList[n];
//        for(int i=0; i<n; i++){
//            buckets[i] = new ArrayList<Integer>();
//        }
//        for(int i=0; i<n; i++){
//            int idx = (int) arr[i]*n;
//            buckets[idx].add(arr[i]);
//        }
//        for(int i=0; i<buckets.length; i++){
//            Collections.sort(buckets[i]);
//        }
//        int index = 0;
//        for(int i=0; i<buckets.length; i++){
//            ArrayList<Integer> Cbuc = buckets[i];
//            for(int j=0; j<Cbuc.size(); j++){
//                arr[index++] = Cbuc.get(j);
//            }
//        }
//    }
static void bucketSort(int[] arr){
    int n = arr.length;
    // Buckets
    ArrayList<Integer>[] buckets = new ArrayList[n];
    // Create empty buckets
    for(int i = 0; i < n; i++){
        buckets[i] = new ArrayList<Integer>();
    }
    // Add elements into our buckets
    for(int i = 0; i < n; i++){
        int bucketIndex = (int) arr[i] * n;
        buckets[bucketIndex].add(arr[i]);
    }
    // Sort each bucket individually
    for(int i = 0; i < buckets.length; i++){
        Collections.sort(buckets[i]);
    }
    // Merge all buckets to get final sorted array
    int index = 0;
    for(int i = 0; i < buckets.length; i++){
        ArrayList<Integer> currBucket = buckets[i];
        for(int j = 0; j < currBucket.size(); j++){
            arr[index++] = currBucket.get(j);
        }
    }
}
    public static void main(String[] args) {
        int[] arr = {4,3,5,2,1};
        bucketSort(arr);
        for(int i: arr){
            System.out.print(i+"\t");
        }
    }
}
