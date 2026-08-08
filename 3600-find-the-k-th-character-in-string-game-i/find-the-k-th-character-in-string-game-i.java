class Solution {
    public char kthCharacter(int k) {
        StringBuilder st = new StringBuilder("a");

        while(st.length()<k){
            int size = st.length();

            for(int i=0;i<size;i++){
                st.append((char)('a'+((st.charAt(i)-'a')+1) % 26));
            }
        }
        return st.charAt(k-1);
    }
}