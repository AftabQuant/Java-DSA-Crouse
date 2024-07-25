import java.util.Arrays;

public class ArrayList {
    static class Arraylist{
        int[] arr = new int[2];
        int idx = 0;
        int size = 0;
        void add(int ele){
            if(size == arr.length){
                int[] brr = Arrays.copyOf(arr,arr.length*2);
                arr = brr;
            }
            arr[idx] = ele;
            idx++;
            size++;
        }
        void set(int idx, int ele){
            arr[idx] = ele;
        }
    }
    public static void main(String[] args) {
        Arraylist arr = new Arraylist();
        arr.add(1);
        arr.add(2);
        System.out.println(arr.size);
        arr.add(3);
        System.out.println(arr.size);
        arr.set(2,20);
    }
}
