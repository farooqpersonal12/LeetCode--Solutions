class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<1) return false;
        if( n == 1 ) return true;

        int p = 1;
        return helper(n,p);
    }

    static boolean helper(int n ,int p){

        if(Math.pow(3,p)<n){
            return helper(n,++p);
        }

        if(Math.pow(3,p) == n){
            return true;
        }
        return false;
    }
}