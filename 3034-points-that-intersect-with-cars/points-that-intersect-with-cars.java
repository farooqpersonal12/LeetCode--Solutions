class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        nums.sort(Comparator.comparingInt(interval -> interval.get(0)));

        int coveredPoints = 0;
        int start = nums.get(0).get(0);
        int end = nums.get(0).get(1);

        for (int i = 1; i < nums.size(); i++) {
            int nextStart = nums.get(i).get(0);
            int nextEnd = nums.get(i).get(1);

            if (nextStart <= end + 1) {
                end = Math.max(end, nextEnd);
            } else {
                coveredPoints += end - start + 1;
                start = nextStart;
                end = nextEnd;
            }
        }

        return coveredPoints + end - start + 1;
    }
}