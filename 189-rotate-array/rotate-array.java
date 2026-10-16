class Solution {
    public void rotate(int[] nums, int k) {

        int n = nums.length;
        k = k % n;

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i =n - k ; i < n; i++) {
            numbers.add(nums[i]);
        }
        for (int index = 0; index < n - k; index++) {
            numbers.add(nums[index]);
        }

        for (int i = 0; i < n; i++) {
            nums[i] = numbers.get(i);
        }

    }
}