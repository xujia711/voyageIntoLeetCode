class Solution {
    public void moveZeroes(int[] nums) {
        int zeroAmount = nums[0] == 0 ? 1 : 0;

        for (int i = 1; i < nums.length; i++) {
            int current = nums[i];

            if (current == 0) {
                zeroAmount ++;
            } else if (zeroAmount > 0) {
                int tmp = nums[i - zeroAmount];
                nums[i - zeroAmount] = current;
                nums[i] = tmp;
            }
        }
    }
}