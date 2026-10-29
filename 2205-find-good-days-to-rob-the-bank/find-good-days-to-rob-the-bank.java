
class Solution {
    public List<Integer> goodDaysToRobBank(int[] security, int time) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = security.length;

        int[] nonIncreasing = new int[n];
        for (int i = 1; i < n; i++) {
            if (security[i] > security[i - 1]) {
                nonIncreasing[i] = 0;
            } else {
                nonIncreasing[i] = nonIncreasing[i - 1] + 1;
            }
        }

        int[] nonDecreasing = new int[n];
        for (int i = n - 2; i >= 0; i--) {
            if (security[i] <= security[i + 1]) {
                nonDecreasing[i] = nonDecreasing[i + 1] + 1;
            } else {
                nonDecreasing[i] = 0;
            }
        }

        for (int i = time; i < n - time; i++) {
            if (nonIncreasing[i] >= time && nonDecreasing[i] >= time) {
                ans.add(i);
            }
        }

        return ans;
    }
}
