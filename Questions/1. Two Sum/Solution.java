class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(nums.length);

        for (int i = 0; i < nums.length; i++) {
            int value1 = nums[i];
            int value2 = target - value1;

            if (map.containsKey(value2) && map.get(value2) != i) {
                return new int[] {i, map.get(value2)};
            } else {
                map.put(value1, i);
            }
        }

        throw new IllegalArgumentException("No solution");
    }
}