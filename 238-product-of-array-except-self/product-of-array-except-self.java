class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Arrays.fill(result, 1);

        int prefix = 1, postfix = 1;
        for (int i = 0; i < n; i++) {
            result[i] *= prefix;
            prefix *= nums[i];
        }
        for (int j = n - 1; j >= 0; j--) {
            result[j] *= postfix;
            postfix *= nums[j];
        }

        return result;
    }
}