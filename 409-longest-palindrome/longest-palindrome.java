class Solution {
    public int longestPalindrome(String s) {
        if(s.length() == 1){
            return 1;
        }
        int len = 0;
        boolean hasodd = false;
        HashMap<Character,Integer> map = new HashMap<>();

        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for(int f : map.values()){
            if(f % 2 == 0){
               len +=f;
            }else{
                len+=f-1;
                hasodd = true;
            }
        }

        if(hasodd) return len+1;

        return  len ;

    }
}