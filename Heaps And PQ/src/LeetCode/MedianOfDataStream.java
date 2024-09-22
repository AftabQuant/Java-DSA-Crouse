package LeetCode;
import java.util.*;

class MedianFinder {
    PriorityQueue<Integer> maxHeap;
    PriorityQueue<Integer> minHeap;
    public MedianFinder() {
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        minHeap = new PriorityQueue<>();
    }

    public void addNum(int num) {
        if(maxHeap.isEmpty()) maxHeap.add(num);
        else{
            if(num>maxHeap.peek()) minHeap.add(num);
            else maxHeap.add(num);
        }
        if(maxHeap.size() == minHeap.size()+2){
            int top = maxHeap.remove();
            minHeap.add(top);
        }
        if(minHeap.size() == maxHeap.size()+2){
        int top = minHeap.remove();
        maxHeap.add(top);
        }
    }

    public double findMedian() {
        if(maxHeap.size() == minHeap.size())return (maxHeap.peek() + minHeap.peek())/2.0;
        else if(maxHeap.size()> minHeap.size()) return maxHeap.peek();
        else return minHeap.peek();
    }
}
// Time Complexity  = n*n(logn)
class MedianFinder1 {
    List<Integer> ans = new ArrayList<>();
    public MedianFinder1() {

    }

    public void addNum(int num) {
        ans.add(num);
    }

    public double findMedian() {
        Collections.sort(ans);
        int n = ans.size();
        if(n%2 != 0) return ans.get(n/2);
        else return (ans.get(n/2)+ ans.get(n/2-1))/2.0;
    }
}
// Time Complexity  = n*n
class MedianFinder2 {
    List<Integer> ans = new ArrayList<>();
    public MedianFinder2() {

    }
    void swapFunc(int i, int j){
        int temp = ans.get(i);
        ans.set(i,ans.get(j));
        ans.set(j, temp);
    }
    public void addNum(int num) {
        ans.add(num);
        int i = ans.size()-1;
        while(i>0){
            if(ans.get(i)<ans.get(i-1)){
                swapFunc(i, i-1);
                i--;
            }
            else break;
        }
    }

    public double findMedian() {
        int n = ans.size();
        if(n%2 != 0) return ans.get(n/2);
        else return (ans.get(n/2)+ ans.get(n/2-1))/2.0;
    }
}
public class MedianOfDataStream{
    public static void main(String[] args) {

    }
}
