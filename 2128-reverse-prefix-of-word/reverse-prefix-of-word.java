class Solution {
    public String reversePrefix(String word, char ch) {
        int index = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch) {
                index = i;
                break;
            }
        }

        if (index == 0) {
            return word;
        }

        StringBuilder sb = new StringBuilder(word.substring(0, index + 1));
        sb.reverse();

        String result = sb.toString() + word.substring(index + 1);

        return result; 
    }
}