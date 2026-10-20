class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        int n = nums.length;

        for (int index = 0; index < n - 2; index++) {

            if (index > 0 && nums[index] == nums[index - 1]) {
                continue;
            }

            int left = index + 1;
            int right = n - 1;

            while (left < right) {

                int sum = nums[index] + nums[left] + nums[right];

                if (sum == 0) {

                    List<Integer> res = new ArrayList<>();
                    res.add(nums[index]);
                    res.add(nums[left]);
                    res.add(nums[right]);

                    result.add(res);

                    left++;
                    right--;
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }

                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return result;
    }
}