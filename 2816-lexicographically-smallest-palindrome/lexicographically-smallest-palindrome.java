class Solution {
    public String makeSmallestPalindrome(String s) {
        if (s.length() < 1) {
            return null;
        }

        char[] sb = s.toCharArray();
        int left = 0, right = sb.length - 1;
        while (left < right) {

            if (sb[left] == sb[right]) {
                left++;
                right--;
            } else {
                char lc = sb[left];
                char rc = sb[right];

                if (lc < rc) {
                    sb[right] = sb[left];
                    left++;
                    right--;
                }else{
                    sb[left] = sb[right];
                    left++;
                    right--;
                }
            }
        }

        return new String(sb);
    }
}