import java.util.LinkedList;
import java.util.Queue;
public class PracticeSet1 {
    static class Queue{
        int[] ar = new int[10];
        int n = ar.length;
        int f = -1;
        int r = -1;
        void add(int x){
            if(f==-1){
                f= r= 0;
                ar[0] = x;
            }
            else{
                ar[++r] = x;
            }
        }
        int pop(){
            int top = ar[f];
            ar[f++] = f;
            return top;
        }
        int peek(){
            return ar[f];
        }
        void display(){
            for(int i=f; i<=r; i++){
                System.out.print(ar[i]+"\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display();
        q.pop();
        q.display();
    }
}
