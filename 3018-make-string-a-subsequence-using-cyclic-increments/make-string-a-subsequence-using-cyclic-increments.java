class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int pointer1 = 0;
        int pointer2 = 0;

        while (pointer1 < str1.length() && pointer2 < str2.length()) {
            char s1 = str1.charAt(pointer1);
            char next = (char) (s1 == 'z' ? 'a' : s1 + 1);

            if (s1 == str2.charAt(pointer2) ||
                    next == str2.charAt(pointer2)) {
                pointer2++;
            }

            pointer1++;
        }

        return pointer2 == str2.length();
    }
}