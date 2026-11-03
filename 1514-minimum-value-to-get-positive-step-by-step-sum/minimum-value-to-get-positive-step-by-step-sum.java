class Solution {
    public int minStartValue(int[] nums) {
        int n = nums.length;
        int prefix = 0;
        int min = Integer.MAX_VALUE;;
        for(int i = 0 ; i < n ; i++){
            prefix += nums[i];
            min = Math.min(min, prefix);
        }
        if(min < 0) return Math.abs(min) + 1;
        return 1;
    }
}