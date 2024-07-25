package Java_Decode;

public class StockSpanProblem{
    static void printArray(int[] s){
        for(int ele : s) System.out.print(ele+" ");
        System.out.println();
    }
    static void calculateSpan(int[] price, int n, int[] ar){
        ar[0] = 1;
        for(int i=1; i<n; i++){
            int count = 1;
            for(int j=i-1; j>=0; j--){
                if(price[i]>price[j]) count++;
            }
            ar[i] = count;
        }
    }
    public static void main(String[] args){
        int[] price = {100, 80, 60, 70, 60, 75, 85};
        int n = price.length;
        int[] s = new int[n];
        calculateSpan(price,n,s);
        printArray(s);
    }
}
