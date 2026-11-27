class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {

        int n = nums.size();
        int minSum = Integer.MAX_VALUE;

        for (int i = l; i <= r; i++) {
            int left = 0;
            int right = i - 1;

            while (right < n) {
                int windowSum = 0;

                for (int j = left; j <= right; j++) {
                    windowSum += nums.get(j);
                }

                if (windowSum > 0) {
                    minSum = Math.min(minSum, windowSum);
                }

                left++;
                right++;
            }
        }

        return minSum == Integer.MAX_VALUE ? -1 : minSum;
    }
}