class Solution {
    public int removeElement(int[] nums, int val) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                result.add(nums[i]);
            }
        }
        int ans = result.size();
        for (int i = 0; i < ans; i++) {
            nums[i] = result.get(i);
        }

        return ans;

    }
}