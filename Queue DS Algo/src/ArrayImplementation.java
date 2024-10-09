public class ArrayImplementation {
    static class Queue{
        int[] arr = new int[15];
        int f = -1;
        int r = -1;
        int size = 0;
        void add(int val){
            if(f==-1){
                f=r=0;
                arr[0] = val;
            }
            else{
                arr[++r] = val;
            }
            size++;
        }
        int remove(){
            int x = arr[f];
            arr[f++]=f;
            //f++
            return x;
        }
        int peek(){
            return arr[f];
        }
        void display(){
            for(int i=f;i<=r;i++){
                System.out.print(arr[i]+"\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(4);
        q.add(3);
        q.add(2);
        q.add(1);
        q.display();
        q.add(3);
        q.display();
        System.out.println(q.peek());
    }
}
