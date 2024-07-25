package Java_Decode;

public class Recursion{
    static void oneTon(int n){
        if(n<=0) return;
        oneTon(n-1);
        System.out.print(n+"\t");
    }
    static void nToOne(int a){
        if(a<=0) return;
        System.out.print(a+"\t");
        nToOne(a-1);
    }
    static int factorialNum(int n){
        if(n<=1) return 1;
        return (n*factorialNum(n-1));
    }
    static int sumofNum(int n){
        if(n<=1) return n;
        return (n+sumofNum(n-1));
    }
    static int product(int n){
        if(n==1) return 1;
        return (n * sumofNum(n-1));
    }
    static int fibonacciNum(int n){
        if(n<=1) return 1;
        return fibonacciNum(n-1) + fibonacciNum(n-2);
    }
    static int power(int a,int b){
        if(b==0) return 1;
        int ans = power(a,b/2);
        if(b%2 == 0) return ans*ans;
        else return ans*ans*a;

    }
    static void KthTable(int n, int k){
        if(k<=0) return;
        KthTable(n,k-1);
        System.out.print((n*k)+"\t");

    }
    static int stairPath(int n){
        if(n<=2) return n;
        return stairPath(n-1)+stairPath(n-2);
    }
    static int stairPath2(int n){
        if(n==1) return 1;
        else if (n==3) return 2;
        return stairPath(n-1)+stairPath(n-3);
    }
    static int mazePaths(int m, int n){
        if(m == 1 || n == 1) return 1;
        int rightWays = mazePaths(m-1,n);
        int downWays = mazePaths(m,n-1);
        return rightWays + downWays;
    }
    static int digitSum(int n){
        if(n == 0) return n;
        int rem = n%10;
        return rem + digitSum(n/10);
    }
    static int naturalSum(int n){
        if(n<=1) return n;
        if(n%2 == 0) return  naturalSum(n-1) - n;
        else return  naturalSum(n-1) + n;
    }
    static void printArray(int[] arr, int idx){
        if(idx == arr.length) return;
        System.out.print(arr[idx]+"\t");
        printArray(arr,idx+1);
    }
    static void StringTraversal(int idx, String str){
        if(idx == str.length()) return;
        System.out.print(str.charAt(idx));
        StringTraversal(idx+1,str);
    }
    static void skipAlphabet(int idx, String str, String res){
        if(idx == str.length()){
            System.out.println(res);
            return;
        }
        if(str.charAt(idx) != 'A' || str.charAt(idx) != 'a') res += str.charAt(idx);
        skipAlphabet(idx+1,str,res);
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7};
        printArray(arr,0);
        System.out.println();
        String str = "Md Aftab Uddin";
        StringTraversal(0,str);
        System.out.println();
        skipAlphabet(0,str,"");
    }
}
