package Java_Decode;

public class occurrenceMost{
    public static void main(String[] args) {
        int[] arr = new int[26];
        String str = "ajhfwsajhgaaahdgfx";
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            int idx = ((int) ch) - 97;
            arr[idx]++;
        }
        int mx = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            mx = Math.max(mx,arr[i]);
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i] == mx){
                char ch = (char) (i+97);
                System.out.println(ch);
            }
        }
    }
}
