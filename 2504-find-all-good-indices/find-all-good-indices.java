class Solution {
    public List<Integer> goodIndices(int[] nums, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = nums.length;
        int[] nonInc = new int[nums.length];
        for (int i = 1; i < n; i++) {
            if (nums[i] > nums[i - 1]) {
                nonInc[i] = 0;
            } else {
                nonInc[i] = nonInc[i - 1] + 1;
            }
        }

        int[] nonDec = new int[nums.length];
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] <= nums[i + 1]) {
                nonDec[i] = nonDec[i + 1] + 1;
            } else {
                nonDec[i] = 0;
            }
        }

        for (int i = k; i < n - k; i++) {
            if (nonInc[i - 1] >= k - 1 && nonDec[i + 1] >= k - 1) {
                ans.add(i);
            }
        }

        // Collections.sort(ans);

        return ans;
    }
}