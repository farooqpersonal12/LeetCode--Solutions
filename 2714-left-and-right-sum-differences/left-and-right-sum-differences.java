class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] leftsum = new int[nums.length];
        int[] rightsum = new int[nums.length];
        int[] ans = new int[nums.length];

        int left = 1;
        int right = nums.length - 2;

        leftsum[0] = 0;
        rightsum[nums.length - 1] = 0;

        while (left < nums.length && right >= 0) {
            leftsum[left] = leftsum[left - 1] + nums[left - 1];
            rightsum[right] = rightsum[right + 1] + nums[right + 1];

            left++;
            right--;
        }

        for (int i = 0; i < ans.length; i++) {
            ans[i] = Math.abs(leftsum[i] - rightsum[i]);
        }

        return ans;

    }
}