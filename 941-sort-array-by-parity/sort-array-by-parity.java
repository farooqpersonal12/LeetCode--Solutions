class Solution {
    public int[] sortArrayByParity(int[] nums) {
        if (nums.length == 1) {
            return nums;
        }
        int right = nums.length - 1, left = 0;

        while (left < right) {

            if (nums[left] % 2 == 0) {
                left++;
            } else if (nums[right] % 2 != 0) {
                right--;
            } else {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;

                left++;
                right--;
            }

        }
        return nums;
    }
}