class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int diff=Math.abs(nums[nums.length-1]-nums[0]);

        for(int i=0;i<nums.length-1; i++){
            int currentDiff= Math.abs(nums[i+1]-nums[i]);
            if(currentDiff>diff){
                diff= currentDiff;
            }
        }
        return diff;
    }
}