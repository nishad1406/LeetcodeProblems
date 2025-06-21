class Solution {
    public int countNegatives(int[][] grid) {
        int count=0;
        for(int[] nums: grid ){
            for(int num: nums){
                if(num<0)
                    count++;
            }
        }
        return count;
    }
}