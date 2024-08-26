package HashMaps;
import java.util.*;

class Node{
    int val;
    Node left;
    Node right;
    Node(int val){this.val = val;}
}
class Pair{
    int val;
    Node node;
    Pair(int val,Node node){
        this.val = val;
        this.node = node;
    }
}
public class TopViewOfBT{
    static List<Integer> bfs(Node root){
        Queue<Pair> que = new ArrayDeque<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        if(root!=null) que.add(new Pair(0,root));
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        while(!que.isEmpty()){
            Pair temp = que.remove();
            Node n = temp.node;
            int level = temp.val;
            min = Math.min(level,min);
            max = Math.max(level,max);
            if(!map.containsKey(level)) map.put(level,n.val);
            if(n.left!=null)  que.add(new Pair(level-1,root.left));
            if(n.right!=null)  que.add(new Pair(level+1,root.right));
        }
        List<Integer> ans = new ArrayList<>();
        for(int i=min; i<=max; i++){
            ans.add(map.get(i));
        }
       return ans;
    }
    public static void main(String[] args) {
    }
}
