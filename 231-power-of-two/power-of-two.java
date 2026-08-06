class Solution {
    public boolean isPowerOfTwo(int n) {
        if( n == 1 ) return true;

        if(n % 2 !=0) return false;
        int p = 1;
        return helper(n,p);
    }

    static boolean helper(int n ,int p){

        if(Math.pow(2,p)<n){
            return helper(n,++p);
        }

        if(Math.pow(2,p) == n){
            return true;
        }
        return false;
    }
}