class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {

        if (nums1.length == 0 && nums2.length == 0) {
            return new int[][] { { -1, -1 } };
        }

        List<int[]> result = new ArrayList<>();

        int pointer1 = 0, pointer2 = 0;

        while (pointer1 < nums1.length && pointer2 < nums2.length) {
            int[] data1 = nums1[pointer1];
            int[] data2 = nums2[pointer2];

            if (data1[0] == data2[0]) {
                result.add(new int[] { data1[0], data1[1] + data2[1] });
                pointer1++;
                pointer2++;
            } else if (data1[0] < data2[0]) {
                result.add(data1);
                pointer1++;
            } else {
                result.add(data2);
                pointer2++;
            }
        }
        while (pointer1 < nums1.length) {
            result.add(nums1[pointer1++]);
        }

        while (pointer2 < nums2.length) {
            result.add(nums2[pointer2++]);
        }

        return result.toArray(new int[0][]);

    }
}