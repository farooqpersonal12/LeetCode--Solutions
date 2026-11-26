class Solution {
    public int countValidSelections(int[] nums) {
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                int sum_right = rightSum(i, nums);
                int sum_left = leftSum(i, nums);

                if (sum_right == sum_left) {
                    count += 2;
                } else if (sum_right - 1 == sum_left) {
                    count += 1;
                } else if (sum_right == sum_left - 1) {
                    count += 1;
                }
            }
        }
        return count;
    }

    private int leftSum(int i, int[] nums) {
        if (i == 0) {
            return 0;
        }
        int sum = 0;
        for (int j = i; j >= 0; j--) {
            sum += nums[j];
        }

        return sum;
    }

    private int rightSum(int i, int[] nums) {
        if (i == nums.length - 1) {
            return 0;
        }
        int sum = 0;
        for (int j = i; j < nums.length; j++) {
            sum += nums[j];
        }
        return sum;
    }
}