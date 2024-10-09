public class PracticeSet2{
    static class Queue{
        int[] ar = new int[5];
        int n = ar.length;
        int f = -1, r = -1;
        void add(int val){
            if(f==-1){
                f=r=0;
                ar[0] = val;
            } else if(r==n){
                System.out.println("Full!");
                return;
            }
            else if(r == n-1){
                r = 0;
                ar[r] = val;
            }
            else{
                ar[++r] = val;
            }

        }
        int remove(){
            int top = ar[f];
            if(f==n-1){
                f=0;
                return top;
            }
            else{
                f++;
            }
            return top;
        }
        int peek(){
            return ar[f];
        }
        void display(){
            if(f<=r){
                for(int i=f; i<=r; i++){
                    System.out.print(ar[i]+"\t");
                }
            }
            else{
                if(r>f){
                    for(int i=f; i<n; i++){
                        System.out.print(ar[i]+"\t");
                    }
                }
                else{
                    for(int i=0; i<=f; i++){
                        System.out.print(ar[i]+"\t");
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(3);
        q.add(9);
        q.add(8);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(5);
        q.add(6);
        q.display();
    }
}
