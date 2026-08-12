class Solution {
    public int kthGrammar(int n, int k) {
        return fun(n, k);
    }

    private int fun(int n, int k) {
        if (n == 1 && k == 1)
            return 0;
        int mid =(int) Math.pow(2, n - 1) / 2;
        if (k <= mid) {
            return fun(n - 1, k);
        }
        return 1-fun(n - 1, k - mid);
    }
}