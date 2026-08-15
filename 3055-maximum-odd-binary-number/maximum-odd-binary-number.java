class Solution {
    public String maximumOddBinaryNumber(String s) {
        if (s.length() == 1) {
            return s;
        }

        int oneCnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                oneCnt++;
            }
        }
        int zeroCnt = s.length() - oneCnt;

        StringBuilder sb = new StringBuilder();

        if (oneCnt > 0) {
            sb.append("1".repeat(oneCnt - 1)); 
            sb.append("0".repeat(zeroCnt)); 
            sb.append("1"); 
        }

        return sb.toString();
    }
}