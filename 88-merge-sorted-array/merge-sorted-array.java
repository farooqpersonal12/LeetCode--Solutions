class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int valofnums2 = 0;
        for (int i = m; i < nums1.length; i++) {
            if (nums1[i] == 0) {
                nums1[i] = nums2[valofnums2++];
            }
        }

        Arrays.sort(nums1);
        // int left = 0, right = nums1.length - 1;

        // while (left < right) {
        //     if (nums1[left] > nums1[right]) {
        //         int temp = nums1[left];
        //         nums1[left] = nums1[right];
        //         nums1[right] = temp;
        //     }

        //     left++;
        //     right--;
        // }
    }
}