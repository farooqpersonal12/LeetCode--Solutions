class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n = words.length;
        int[] prefixsum = new int[n + 1];
        Set<Character> vowelSet = new HashSet<>(List.of('a', 'e', 'i', 'o', 'u'));

        for (int i = 0; i < n; i++) {
            prefixsum[i + 1] = prefixsum[i];
            if (vowelSet.contains(words[i].charAt(0)) && vowelSet.contains(words[i].charAt(words[i].length() - 1))) {
                prefixsum[i + 1]++;
            }
        }

        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            ans[i] = prefixsum[queries[i][1] + 1] - prefixsum[queries[i][0]];
        }
        return ans;
    }
}