class Solution {
    public int nextGreaterElement(int n) {

        String[] st = String.valueOf(n).split("");

        if (st.length == 1) {
            return -1;
        }

        int smallerValueindex = -1;

        for (int i = st.length - 2; i >= 0; i--) {
            if (Integer.parseInt(st[i]) < Integer.parseInt(st[i + 1])) {
                smallerValueindex = i;
                break;
            }
        }

        if (smallerValueindex == -1) {
            return -1;
        }

        String smallerValue = st[smallerValueindex];

        int biggerValueIndex = -1;

        for (int i = st.length - 1; i > smallerValueindex; i--) {
            if (Integer.parseInt(st[i]) > Integer.parseInt(smallerValue)) {
                biggerValueIndex = i;
                break;
            }
        }

        String temp = st[smallerValueindex];
        st[smallerValueindex] = st[biggerValueIndex];
        st[biggerValueIndex] = temp;

        reverse(st, smallerValueindex + 1);

        long result = Long.parseLong(String.join("", st));

        return result > Integer.MAX_VALUE ? -1 : (int) result;

    }

    private static void reverse(String[] arr, int index) {

        int left = index;
        int right = arr.length - 1;

        while (left < right) {
            String temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

    }
}