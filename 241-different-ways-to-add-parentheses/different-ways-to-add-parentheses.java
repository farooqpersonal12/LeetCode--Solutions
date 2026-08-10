class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> result = new ArrayList<>();

        if (expression.length() == 0)
            return result;

        if (expression.length() == 1) {
            result.add(Integer.parseInt(expression));
            return result;
        }

        if (expression.length() == 2 && Character.isDigit(expression.charAt(0))) {
            result.add(Integer.parseInt(expression));
            return result;
        }

        for (int i = 0; i < expression.length(); i++) {
            char currchar = expression.charAt(i);

            if (Character.isDigit(currchar))
                continue;

            List<Integer> leftRes = diffWaysToCompute(expression.substring(0, i));
            List<Integer> rightRes = diffWaysToCompute(expression.substring(i + 1));

            for (int leftval : leftRes) {
                for (int rightval : rightRes) {
                    int computed = 0;
                    switch (currchar) {
                        case '+':
                            computed = leftval + rightval;
                            break;
                        case '-':
                            computed = leftval - rightval;
                            break;
                        case '*':
                            computed = leftval * rightval;
                            break;
                    }
                    result.add(computed);

                }
            }
        }
        return result;
    }

}