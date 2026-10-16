class Solution {
    public void rotate(int[] nums, int k) {

        int n = nums.length;
        k = k % n;

        // ArrayList<Integer> numbers = new ArrayList<>();

        // for (int i =n - k ; i < n; i++) {
        //     numbers.add(nums[i]);
        // }
        // for (int index = 0; index < n - k; index++) {
        //     numbers.add(nums[index]);
        // }

        // for (int i = 0; i < n; i++) {
        //     nums[i] = numbers.get(i);
        // }
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);

    }

    public static void reverse(int[] nums, int start, int end) {
        while (start <= end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }
}