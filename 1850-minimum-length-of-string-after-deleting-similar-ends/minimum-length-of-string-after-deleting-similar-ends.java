class Solution {
    public int minimumLength(String s) {
        int low = 0;
        int high = s.length() - 1;

        while (low < high) {
            if (s.charAt(low) != s.charAt(high)) {
                break;
            }

            char ch = s.charAt(low);

            while (low <= high && s.charAt(low) == ch) {
                low++;
            }

            while (low <= high && s.charAt(high) == ch) {
                high--;
            }
        }

        return high - low + 1;
    }
}