package Heap;
import java.util.*;

class Pair{
    int x; int y;
    Pair(int x, int y){
        this.x = x;
        this.y = y;
    }
}
class Triplet implements Comparable<Triplet>{
    int d2;
    int x;
    int y;
    Triplet(int d2, int x, int y){
        this.d2 = d2;
        this.x = x;
        this.y = y;
    }
    public int compareTo(Triplet t){
        return this.d2 - t.d2;
    }
}
public class KClosestPointToOrigin{
    // Method 1
    public static int[][] kClosestPair(int[][] points, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        HashMap<Integer, Pair> map = new HashMap<>();
        for(int i=0; i<points.length; i++){
            int x = points[i][0], y = points[i][1];
            int d2 = x*x + y*y;
            pq.add(d2);
            Pair cor = new Pair(x,y);
            map.put(d2,cor);
            if(pq.size()>k) pq.remove();
        }
        int[][] ans = new int[k][2];
        for(int i=0; i<k; i++){
            int key = pq.remove();
            Pair pt = map.get(key);
            ans[i][0] = pt.x;
            ans[i][1] = pt.y;
        }
        return ans;
    }
    public static int[][] kClosest(int[][] points, int k){
        PriorityQueue<Triplet> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i<points.length; i++){
            int x = points[i][0], y = points[i][1];
            int d2 = x*x + y*y;
            Triplet tp = new Triplet(d2,x,y);
            pq.add(tp);
            if(pq.size()>k) pq.remove();
        }
        int[][] ans = new int[k][2];
        for(int i=0; i<k; i++){
            Triplet pt = pq.remove();
            ans[i][0] = pt.x;
            ans[i][1] = pt.y;
        }
        return ans;
    }
    public static void main(String[] args) {

    }
}
