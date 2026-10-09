class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, pointer1 = 0, pointer2 = 0;

        int[] result = new int[m + n];

        while (pointer1 < m && pointer2 < n) {

            if (nums1[pointer1] > nums2[pointer2]) {
                result[i++] = nums2[pointer2++];
            } else {
                result[i++] = nums1[pointer1++];
            }
        }

        while (pointer1 < m) {
            result[i++] = nums1[pointer1++];
        }

        while (pointer2 < n) {
            result[i++] = nums2[pointer2++];
        }

        for (int j = 0; j < result.length; j++) {
            nums1[j] = result[j];
        }
    }
}