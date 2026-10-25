class Solution {
    public int[] shortestToChar(String s, char c) {
        ArrayList<Integer> charIndexs = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                charIndexs.add(i);
            }
        }

        int[] ans = new int[s.length()];

        for (int i = 0; i < ans.length; i++) {
            int minDistance = Integer.MAX_VALUE;
            for (int j : charIndexs) {
                int absDistance = Math.abs(i - j);
                minDistance = Math.min(minDistance, absDistance);
            }
            ans[i] = minDistance;
        }

        return ans;
    }
}