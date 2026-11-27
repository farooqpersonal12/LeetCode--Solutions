class Solution {
    public int pivotInteger(int n) {
        for (int i = 1; i <= n; i++) {
            int rightSum = RightSum(i, n);
            int leftSum = LeftSum(i);

            if (rightSum == leftSum) {
                return i;
            }
        }

        return -1;
    }

    private int RightSum(int i, int n) {
        int sum = 0;
        for (int j = i; j <= n; j++) {
            sum += j;
        }
        return sum;
    }

    private int LeftSum(int i) {
        int sum = 0;
        for (int j = 1; j <= i; j++) {
            sum += j;
        }
        return sum;
    }
}