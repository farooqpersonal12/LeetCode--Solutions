class Solution {
    public int bestClosingTime(String customers) {
        int n = customers.length();
        int[] prefixsum = new int[n + 1];
        int[] sufixsum = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            prefixsum[i] = prefixsum[i - 1];
            if (customers.charAt(i-1) == 'N') {
                prefixsum[i] += 1;
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            sufixsum[i] = sufixsum[i + 1];

            if (customers.charAt(i) == 'Y') {
                sufixsum[i]++;
            }
        }

        int minPanality = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < n + 1; i++) {
            int penalty = prefixsum[i] + sufixsum[i];
            if (penalty < minPanality) {
                minPanality = Math.min(minPanality, penalty);
                index = i;
            }
        }
        return index;
    }
}