class Solution {
    public int[] applyOperations(int[] nums) {
        int slow = 0, fast = 1;

        while (fast < nums.length) {

            if (nums[slow] == nums[fast]) {
                nums[slow] *= 2;
                nums[fast] = 0;
                slow++;
                fast++;
            } else {
                slow++;
                fast++;
            }
        }

        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }

        while (index < nums.length) {
            nums[index] = 0;
            index++;
        }
        return nums;
    }
}