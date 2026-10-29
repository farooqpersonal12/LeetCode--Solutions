class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int[] prefixsum = new int[n];
        int[] sufixsum = new int[n];

        prefixsum[0] = nums[0];
        sufixsum[n - 1] = nums[n - 1];

        for (int i = 1; i < n; i++) {
            prefixsum[i] = prefixsum[i - 1] + nums[i];
            sufixsum[n - i - 1] = sufixsum[n - i] + nums[n - i - 1];
        }

        for (int i = 0; i < n; i++) {
            int r = ((nums[i] * i) - prefixsum[i]) + (sufixsum[i] - (nums[i] * (n - i - 1)));
            result[i] = r;
        }

        return result;
    }
}