class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int maxPair=0;
        for(int i=0,j=nums.length-1;i<nums.length/2;i++,j--){
            if(nums[i]+nums[j]>=maxPair)
            maxPair=nums[i]+nums[j];
        }
        return maxPair;
    }
}