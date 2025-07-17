class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int count = 0;
        Map<Integer, Integer> numMap = new HashMap<>();

        for (int num : nums) {
            numMap.put(num, numMap.getOrDefault(num, 0) + 1);
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] - nums[i] == diff) {
                    if (numMap.containsKey(nums[j] + diff)) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
}