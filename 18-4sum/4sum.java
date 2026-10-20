class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        int n = nums.length;

        for (int index = 0; index < n - 3; index++) {

            if (index > 0 && nums[index] == nums[index - 1]) {
                continue;
            }

            for (int j = index + 1; j < n - 2; j++) {

                if (j > index + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }

                int left = j + 1;
                int right = n - 1;

                while (left < right) {

                    long sum = (long) nums[index] + nums[j]
                            + nums[left] + nums[right];

                    if (sum == target) {

                        List<Integer> res = new ArrayList<>();
                        res.add(nums[index]);
                        res.add(nums[j]);
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

                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return result;
    }
}