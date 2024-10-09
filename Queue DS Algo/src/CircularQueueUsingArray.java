
public class CircularQueueUsingArray {
    static class circularQueue{
        int[] arr = new int[5];
        int f=-1;
        int r=-1;
        int size=0;
        public void add(int data) throws Exception{
            if(size==arr.length){
                throw new Exception("Full!");
            } else if(f==-1){
                f = r =0;
                arr[0] = data;
                return;
            }
            else if(r==arr.length-1){
                r = 0;
                arr[0] = data;
            }
            else{
                arr[++r] = data;
            }
            size++;
        }
        int remove() throws Exception{
            if(size==0){
                throw new Exception("Empty Queue");
            }
            else{
                int x = arr[f];
                if(size==arr.length-1) f = 0;
                else f++;
                size--;
                return x;
            }
        }
        int peek()throws Exception{
            if(size==-1){
                throw new Exception("Empty Queue");
            }
            else{
                return arr[f];
            }
        }
        void display(){
            if(size==0){
                System.out.println("Empty Queue");
            } else if(f<=r){
                for(int i=f;i<=r;i++){
                    System.out.print(arr[i]+" ");
                }
            }
            else{
                for(int i=f;i<arr.length;i++){
                    System.out.print(arr[i]+" ");
                }
                for(int i=0;i<=r;i++){
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws Exception {
        circularQueue q = new circularQueue();
        q.add(1);
        q.add(4);
        q.add(4);
        q.add(4);
        q.add(3);
        q.add(9);
//        q.add(7);
        q.display();
        q.remove();
        q.display();
        System.out.println(q.peek());
        System.out.println(q.size);
    }
}
