class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        if (nums.length <= 1) {
            return nums;
        }

        int evenPointer = 0;
        int oddPointer = 1;

        while (evenPointer < nums.length && oddPointer < nums.length) {

            if (nums[evenPointer] % 2 == 0) {
                evenPointer += 2;
            } else if (nums[oddPointer] % 2 != 0) {
                oddPointer += 2;
            } else {
                int temp = nums[evenPointer];
                nums[evenPointer] = nums[oddPointer];
                nums[oddPointer] = temp;

                evenPointer += 2;
                oddPointer += 2;
            }
        }

        return nums;
    }
}