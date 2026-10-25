class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");

        for (int i = 0; i < words.length; i++) {
            char[] word = words[i].toCharArray();
            int left = 0;
            int right = word.length - 1;

            while (left < right) {
                swap(word, left, right);
                left++;
                right--;
            }
            words[i] = new String(word);
        }
        return String.join(" ", words);
    }
    private static void swap(char[] word, int i, int j) {
        char temp = word[i];
        word[i] = word[j];
        word[j] = temp;
    }
}