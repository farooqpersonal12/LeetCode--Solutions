class Solution {
    public void sortColors(int[] nums) {
        int zeroCount = 0;
        int oneCount = 0;
        int twoCount = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroCount++;
            } else if (nums[i] == 1) {
                oneCount++;
            } else {
                twoCount++;
            }
        }

        int index = 0;
        for (int i = 0; i < zeroCount; i++) {
            nums[index++] = 0;
        }

        for (int i = 0; i < oneCount; i++) {
            nums[index++] = 1;
        }

        for (int i = 0; i < twoCount; i++) {
            nums[index++] = 2;
        }
    }
}