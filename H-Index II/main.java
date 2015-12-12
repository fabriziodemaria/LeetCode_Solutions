class Solution {
    public int hIndex(int[] citations) {
        int j = 1;
        for (int i = citations.length - 1; i >= 0; i--) {
            if (citations[i] < j) return j-1; 
            j++;
        }
        return j-1;
    }
}
