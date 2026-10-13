class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        ArrayList<Integer> positvIntegers = new ArrayList<>();
        ArrayList<Integer> negativeIntegers = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) {
                positvIntegers.add(nums[i]);
            } else {
                negativeIntegers.add(nums[i]);
            }
        }

        ArrayList<int[]> result = new ArrayList<>();

        for (int i = 0; i < positvIntegers.size(); i++) {
            int[] resultPair = new int[2];
            resultPair[0] = positvIntegers.get(i);
            resultPair[1] = negativeIntegers.get(i);
            result.add(resultPair);
        }

        return result.stream().flatMapToInt(Arrays::stream).toArray();
    }
}