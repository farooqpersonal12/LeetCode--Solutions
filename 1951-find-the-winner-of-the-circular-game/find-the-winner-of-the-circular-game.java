class Solution {
    public int findTheWinner(int n, int k) {
        return jsf(n,k);
    }

    private int jsf(int n,int k){
        if (n == 1)
            return 1;
        else
            return (jsf(n-1,k)+k-1) % n+1;
    }
}