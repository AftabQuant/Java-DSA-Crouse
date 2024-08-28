public class SearchElement {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 3};
        int x = 5;
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                ans = i;
            }
        }
        if(ans == 0){
            System.out.println("not found");
        }
        else System.out.println(ans);
    }
}
