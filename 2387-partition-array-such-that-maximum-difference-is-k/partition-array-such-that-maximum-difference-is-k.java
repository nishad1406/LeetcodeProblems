class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
		int count=1;
		int max=nums[0]+k;
        for (int num :nums ) {
			if (num>max) {
				max=num+k;
				count++;
			}
		}
        return count;
    }
}