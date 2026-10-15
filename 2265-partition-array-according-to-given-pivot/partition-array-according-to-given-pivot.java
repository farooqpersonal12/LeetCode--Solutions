class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> elementsLesserThanPivot = new ArrayList<>();
        ArrayList<Integer> elementsEqualToPivot = new ArrayList<>();
        ArrayList<Integer> elementsGreaterThanPivot = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < pivot) {
                elementsLesserThanPivot.add(nums[i]);
            } else if (nums[i] == pivot) {
                elementsEqualToPivot.add(nums[i]);
            } else {
                elementsGreaterThanPivot.add(nums[i]);
            }
        }

        int index = 0;

        for (int num : elementsLesserThanPivot) {
            nums[index++] = num;
        }

        for (int num : elementsEqualToPivot) {
            nums[index++] = num;
        }

        
        for (int num : elementsGreaterThanPivot) {
            nums[index++] = num;
        }

        return nums;
    }
}