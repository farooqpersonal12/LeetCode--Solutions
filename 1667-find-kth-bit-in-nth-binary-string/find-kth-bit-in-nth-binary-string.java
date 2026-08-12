class Solution {
    public char findKthBit(int n, int k) {
        
        StringBuilder s = new StringBuilder("0");

        for(int i=1;i<n && k > s.length();++i){
            s.append('1');
            for(int j = s.length() - 2; j>=0;--j){
                char in  = (s.charAt(j) == '1') ? '0' : '1';
                s.append(in);
            }
        }

        return s.charAt(k-1);
    }
}