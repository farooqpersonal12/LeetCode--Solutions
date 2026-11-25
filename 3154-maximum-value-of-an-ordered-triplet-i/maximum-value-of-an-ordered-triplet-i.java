class Solution {
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        if (n < 3) {
            return 0;
        }
        long maximumTripletValue = 0;
        for (int i = 0; i < n - 2; i++) {
            int j = i + 1;
            int k = j + 1;
            while (k < n) {
                long value = ((long) nums[i] - nums[j]) * nums[k];
                if (value > maximumTripletValue) {
                    maximumTripletValue = value;
                }
                k++;
                if (k == n) {
                    j++;
                    k = j + 1;
                }
            }
        }
        return maximumTripletValue;
    }
}