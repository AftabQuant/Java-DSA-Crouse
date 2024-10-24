public class Convert1dTo2d{
    public static int[][] construct2DArray(int[] original, int m, int n) {
        if(m*n != original.length) return new int[0][0];
        int[][] ans = new int[m][n];
        int idx = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                ans[i][j] = original[idx++];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] original = {1,2,3,4}; int m = 2; int n = 2;
        int[][] ans = construct2DArray(original,m,n);
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
