public class MinPenaltyForShop{
    static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static int bestClosingTime(String customers){
        int n = customers.length();
        int[] pre = new int[n+1];
        int[] suf = new int[n+1];
        for(int i=1; i<=n; i++){
            pre[i] += pre[i-1];
            if(customers.charAt(i-1) == 'N') pre[i] += 1;
        }
        for(int i=n-1; i>=0; i--){
            suf[i] = suf[i+1];
            if(customers.charAt(i) == 'Y'){
                suf[i] += 1;
            }
        }
        int min = Integer.MAX_VALUE;
        int[] res = new int[n+1];
        for(int i=0; i<res.length; i++){
            res[i] = pre[i] + suf[i];
            min = Math.min(min, res[i]);
        }
        for(int i=0; i<res.length; i++){
            if(res[i] == min) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        String s = "YYNY";
        bestClosingTime(s);
    }
}
