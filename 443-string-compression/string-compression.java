class Solution {
    public int compress(char[] chars) {
        int streak = 1;
        StringBuilder ans = new StringBuilder();

        for (int i = 1; i <= chars.length; i++) {
            if (i < chars.length && chars[i] == chars[i - 1]) {
                streak++;
            } else {
                ans.append(chars[i - 1]);

                if (streak > 1) {
                    ans.append(streak);
                }

                streak = 1;
            }
        }

        for (int i = 0; i < ans.length(); i++) {
            chars[i] = ans.charAt(i);
        }

        return ans.length();

    }
}