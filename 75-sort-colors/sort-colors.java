class Solution {
    public void sortColors(int[] nums) {
        int zero=0,ones=0;
		for (int num:nums ) {
			if (num==0)
				zero++;
			else if (num==1)
				ones++;
		}

		for (int i=0;i<zero ;i++ ) {
			nums[i]=0;
		}
		for (int i=zero;i<zero+ones ;i++ ) {
			nums[i]=1;
		}
		for (int i=zero+ones;i<nums.length ;i++ ) {
			nums[i]=2;
		}
    }
}