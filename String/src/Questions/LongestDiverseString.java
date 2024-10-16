package Questions;
import java.util.*;


public class LongestDiverseString {
    class Pair implements Comparable<Pair>{
        char ch;
        int num;
        Pair(char ch, int num){
            this.ch = ch;
            this.num = num;
        }
        public int compareTo(Pair p){
            return p.num - this.num;
        }
    }
    public String longestDiverseString(int a, int b, int c) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        if(a > 0) pq.add(new Pair('a', a));
        if(b > 0)pq.add(new Pair('b', b));
        if(c > 0)pq.add(new Pair('c', c));
        StringBuilder sb = new StringBuilder();
        while(!pq.isEmpty()){
            Pair top = pq.remove();
            char ch = top.ch;
            int count = top.num;
            int n = sb.length();
            if(n>=2 && ch == sb.charAt(n - 1) && sb.charAt(n-2)==ch){
                if (pq.isEmpty()) break;
                Pair sec = pq.remove();
                sb.append(sec.ch);
                sec.num--;
                if (sec.num > 0) pq.offer(new Pair(sec.ch, sec.num));
            }
            else{
                sb.append(top.ch);
                top.num--;
            }
            if(top.num > 0) pq.offer(new Pair(top.ch, top.num));
        }
        return sb.toString();
    }

    public static void main(String[] args) {

    }
}
