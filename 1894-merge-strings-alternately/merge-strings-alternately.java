class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int i, j;
        for (i = 0, j = 0; i < word1.length() & j < word2.length(); i++, j++) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(j));
        }

        if (i != word1.length()) {
            while (i < word1.length()) {
                sb.append(word1.charAt(i));
                i++;
            }
        }

        if (j != word2.length()) {
            while (j < word2.length()) {
                sb.append(word2.charAt(j));
                j++;
            }
        }

        return sb.toString();
    }
}