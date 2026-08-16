class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {

        if (boxTypes.length < 1) {
            return 0;
        }

        Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1], a[1]));

        int totalUnits = 0;
        for (int[] num : boxTypes) {
            int cnt = Math.min(num[0] , truckSize);
            totalUnits += cnt * num[1];
            truckSize-=cnt;
            if(truckSize==0) return totalUnits;
        }

        return totalUnits;
    }
}