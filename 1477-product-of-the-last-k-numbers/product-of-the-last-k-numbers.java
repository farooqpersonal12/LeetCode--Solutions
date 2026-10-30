class ProductOfNumbers {

    private ArrayList<Integer> nums;

    public ProductOfNumbers() {
        nums = new ArrayList<>();
    }

    public void add(int num) {
        nums.add(num);
    }

    public int getProduct(int k) {
        int product = 1;
        int start = nums.size() - k;

        for (int index = start; index < nums.size(); index++) {
            product *= nums.get(index);
        }
        return product;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */