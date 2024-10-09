import java.util.Scanner;

public class Tree {
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data = data;
        }
    }
    static Node createTree(){
        Scanner sc = new Scanner(System.in);
        Node root = null;
        System.out.println("Enter the data : ");
        int data = sc.nextInt();
        if(data==-1) return null;
        Node temp = new Node(data);
        System.out.print("Enter left data : "+ data);
        root.left = createTree();
        System.out.print("Enter right data : "+ data);
        root.right = createTree();
        return root;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        createTree();
    }
}
