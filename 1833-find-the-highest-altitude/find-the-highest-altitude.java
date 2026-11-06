class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int prefixsum = 0;
        int max = 0;

        for (int i = 0; i < n; i++) {
            prefixsum += gain[i];
            max = Math.max(max, prefixsum);
        }

        return max;
    }
}