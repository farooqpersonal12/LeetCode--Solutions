class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int ans = 0;
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
            if (total == 0) {
                ans++;
            }
        }
        return ans;
    }
}