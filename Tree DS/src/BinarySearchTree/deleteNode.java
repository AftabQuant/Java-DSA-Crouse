package BinarySearchTree;

public class deleteNode{
    static void print(Node root){
        if(root==null) return;
        print(root.left);
        System.out.print(root.val+" ");
        print(root.right);
    }
    static Node iop(Node root){
        Node temp = root.left;
        while(temp.right!=null) temp = temp.right;
        return temp;
    }
    static Node parent(Node root, Node pred){
        if(root.left==pred || root.right==pred) return root;
        Node temp = root.left;
        while(temp.right!=pred) temp = temp.right;
        return temp;
    }
    static Node delete(Node root, int key){
        if(root==null) return null;
        if(root.val==key){ // Deletion
            // Case 1: 0 child Node
            if(root.left==null && root.right==null) return null;
            // Case 2: 1 child Node
            else if(root.left==null || root.right==null){
                if(root.right==null) return root.left;
                else return root.right;
            }
            // Case 3: 2 children Nodes
            else{
                 Node pred = iop(root);
                 Node parentPred = parent(root, pred);
                 if(parentPred==root){
                     pred.right = root.right;
                     return pred;
                 }
                 parentPred.right = pred.left;
                 pred.left = root.left; pred.right = root.right;
                 return pred;
            }
        }
        else if(root.val>key) root.left = delete(root.left, key);
        else root.right = delete(root.right,key);
        return root;
    }
    public static void main(String[] args) {
        Node a = new Node(4);
        Node b = new Node(2);
        Node c = new Node(8);
        Node d = new Node(1);
        Node e = new Node(3);
        Node f = new Node(5);
        Node g = new Node(7);
        Node h = new Node(6);
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; f.right = g; g.left = h;
        print(a);
        System.out.println();
        delete(a,4);
        print(e);

    }
}
