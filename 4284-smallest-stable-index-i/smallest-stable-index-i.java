class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        // int[] max = new int[n];
        // int[] min = new int[n];
        // max[0] = nums[0];
        // min[n - 1] = nums[n - 1];

        // for (int i = 1; i < n; i++) {
        //     max[i] = Math.max(nums[i], max[i - 1]);
        // }

        // for (int i = n - 2; i >= 0; i--) {
        //     min[i] = Math.min(nums[i], min[i + 1]);
        // }

        // int result = Integer.MAX_VALUE;

        // for (int i = 0; i < n; i++) {
        //     if ((max[i] - min[i]) <= k) {
        //         result = Math.min(result, i);
        //     }
        // }

        int result = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

            for (int j = i; j >= 0; j--) {
                max = Math.max(max, nums[j]);
            }

            for (int j = i; j < n; j++) {
                min = Math.min(min, nums[j]);
            }

            if (max - min <= k) {
                result = Math.min(result, i);
            }
        }

        return result == Integer.MAX_VALUE ? -1 : result;
    }
}