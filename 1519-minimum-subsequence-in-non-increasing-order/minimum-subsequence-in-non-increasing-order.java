class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        List<Integer> minSub = new ArrayList<>();

        Arrays.sort(nums);

        int sum = 0;
        for(int num:nums){
            sum+=num;
        }

        int curr = 0;

        for(int j=nums.length-1;j>=0;j--){
            sum-=nums[j];
             curr += nums[j];

            minSub.add(nums[j]);

            if(curr>sum){
                return minSub;
            }
        }

        return minSub;
    }
}