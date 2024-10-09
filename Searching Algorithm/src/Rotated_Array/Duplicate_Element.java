package Rotated_Array;

public class Duplicate_Element{
    static int search_(int[] ar, int x){
        int st = 0, end = ar.length-1;
        while(st<=end){
            int mid = st+(end-st)/2;
            if(ar[mid] == x){
                return mid;
            } else if(ar[st] == ar[mid] && ar[end] == mid){
                st++;
                end--;
            } else if (ar[mid]<ar[end]){
                if(ar[mid]<x && ar[end]>x){
                    end = mid-1;
                }
                else st =- mid+1;
            }
            else{
                if(ar[st]<x && ar[mid]>x){
                    end = mid-1;
                }
                else st = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] ar = {1, 1, 1, 1, 2, 2, 3, 3, 2};
        int x = 2;
        System.out.println(search_(ar,2));
    }
}
