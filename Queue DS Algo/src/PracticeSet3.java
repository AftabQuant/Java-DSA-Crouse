public class PracticeSet3{
    static class Queue{
        int[] arr = new int[10];
        int front =-1;
        int rear = -1;
        int size=0;
        void add(int data){
            if(front==-1){
                front=rear=0;
                arr[0] = data;
            } else if(size==arr.length){
                System.out.println("Full Queue!!");
                return;

            } else if(size==arr.length-1){
                rear = 0;
                arr[++rear] = data;

            } else{
                arr[++rear] = data;
            }
            size++;
        }
        int remove(){
            int top = arr[front];
            if(front==-1){
                System.out.print("Empty Queue!!");
                return -1;
            } else if(size==arr.length){
                System.out.println("Full");

            } else if(size==arr.length-1){
                front = 0;
                return top;

            } else{
                front++;
            }
            size--;
            return top;
        }
        int peek(){
            return arr[front];
        }
        void display(){
            if(front<=rear) {
                for (int i = front; i <= rear; i++) {
                    System.out.print(arr[i] + "\t");
                }
            }
            else{
                if(rear>front) {
                    for (int i = front; i < arr.length; i++) {
                        System.out.print(arr[i]);
                    }
                }
                else{
                    for(int i=0; i<=front; i++){
                        System.out.println(arr[i]);
                    }
                }
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
        q.remove();
        q.display();
    }
}
