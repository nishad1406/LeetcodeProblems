class Solution {
    public int findNonMinOrMax(int[] nums) {
        if(nums.length<3) return -1;
        int l = nums[0]; //8
        int m= nums[1]; // 7
        int n= nums[2]; //9
        if((l < m && l > n) || (l > m && l < n)){
            return l;
        } else if ((m > l && m < n) || (m < l && m > n)){
            return m;
        } else {
            return n;
        }
    }
}