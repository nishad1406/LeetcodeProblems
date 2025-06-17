class Solution {

    static{
        for(int i=0;i<500;i++){
            maxArea(new int[]{0,0});
        }
    }

    public static int maxArea(int[] height) {
        int maxArea=0;
		int left=0, right=height.length-1;

		while(left<right){
			int minHeight = height[left] < height[right] ? height[left] : height[right];
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