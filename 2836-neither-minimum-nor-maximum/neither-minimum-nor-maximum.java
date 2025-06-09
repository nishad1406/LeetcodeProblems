class Solution {
    public int findNonMinOrMax(int[] nums) {
        if(nums.length<3) return -1;
        
        int min= Math.min(nums[0], nums[1]);
        int max= Math.max(nums[0], nums[1]);
        if(nums[2]>min && nums[2]<max) return nums[2];
        return (nums[2]<min) ? min : max;
    }
}