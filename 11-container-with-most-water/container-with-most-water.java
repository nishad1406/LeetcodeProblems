class Solution {
    public int maxArea(int[] height) {
        int maxArea=0;
		int left=0, right=height.length-1;

		while(left<right){
			int minHeight=Math.min(height[left],height[right]);
			maxArea = Math.max(maxArea, minHeight*(right-left));

			if (height[left]<height[right]) {
				left++;
			} else {
				right--;
			}
		}
        return maxArea;

    }
}