class Solution {
    public int jump(int[] nums) {
        int n = nums.length; // size of the array
        int jumps = 0, farthest = -1, currentIndex = 0;

        for(int i=0; i<n-1; i++) {
            farthest = Math.max(farthest, i + nums[i]);
            if (i == currentIndex) {
                jumps++;
                currentIndex = farthest;
            }
        }

        return jumps;
    }
}