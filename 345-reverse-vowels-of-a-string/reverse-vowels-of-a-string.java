class Solution {
    public String reverseVowels(String s) {
        int left = 0;
        int right = s.length() - 1;
        StringBuilder sb = new StringBuilder(s);

        while (left < right) {
            if (vowel(Character.toLowerCase(sb.charAt(right)))
                    && vowel(Character.toLowerCase(sb.charAt(left)))) {
                char temp = sb.charAt(left);
                sb.setCharAt(left, sb.charAt(right));
                sb.setCharAt(right, temp);

                left++;
                right--;
            }

            else if (!vowel(Character.toLowerCase(sb.charAt(right)))) {
                right--;
            } else {
                left++;
            }
        }
        return sb.toString();
    }

    private static boolean vowel(char c) {
        return switch (c) {
            case 'a', 'e', 'i', 'o', 'u' -> true;
            default -> false;
        };
    }
}