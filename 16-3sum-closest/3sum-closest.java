
class Solution {
    public int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);

        int n = nums.length;
        int closestSum = nums[0] + nums[1] + nums[2];

        for (int index = 0; index < n - 2; index++) {

            int left = index + 1;
            int right = n - 1;

            while (left < right) {

                int sum = nums[index] + nums[left] + nums[right];

                if (Math.abs(sum - target) < Math.abs(closestSum - target)) {
                    closestSum = sum;
                }

                if (sum == target) {
                    return target;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return closestSum;
    }
}
