public class SentenceSimilarity{
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        if(sentence1.length() > sentence2. length()) return areSentencesSimilar(sentence2, sentence1);
        String[] arr = sentence1.split(" ");
        String[] brr = sentence2.split(" ");
        int st = 0, end1 = arr.length-1, end2 = brr.length -1;
        while (st <= end1 && arr[st].equals(brr[st])) {
            st++;
        }
        while (st <= end2 && arr[end1].equals(brr[end2])) {
            end1--;
            end2--;
        }
        return st > end1;
    }
    public static void main(String[] args) {

    }
}
