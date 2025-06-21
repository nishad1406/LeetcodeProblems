class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int totalLength = nums1.length + nums2.length;
        int mid = totalLength / 2;
		
		int i = 0, j = 0, k = 0;
		int[] merge = new int[mid + 1]; // Only store what’s needed for median
     
        while (k <= mid) {
            if (i < nums1.length && (j >= nums2.length || nums1[i] <= nums2[j])) {
                merge[k++] = nums1[i++];
            } else {
                merge[k++] = nums2[j++];
            }
        }

        double median;
        if (totalLength % 2 == 0) {
            median = (merge[mid] + merge[mid - 1]) / 2.0;
        } else {
            median = merge[mid];
        }

        return median;

       
    }
}