class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        for (int i = left; i <= right; i++) {
            boolean covered = false;

            for (int[] row : ranges) {
                int start = row[0];
                int end = row[1];

                if (i >= start && i <= end) {
                    covered = true;
                    break;
                }
            }

            if (!covered) {
                return false;
            }
        }

        return true;
    }
}