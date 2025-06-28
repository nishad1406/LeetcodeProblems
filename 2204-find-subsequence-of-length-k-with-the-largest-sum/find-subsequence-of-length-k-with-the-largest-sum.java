class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int size=nums.length;
        int sorted[]= Arrays.copyOf(nums, size);
        Arrays.sort(sorted);

        int threshold = sorted[size-k];
        int thrCount=0;
        for(int i=size-k;i<size;i++){
            if(sorted[i]==threshold)
                thrCount++;
        }
        int result[]= new int[k];
        int index=0;
        for(int num: nums){
            if(num>threshold){
                result[index++]=num;
            } else if (num==threshold && thrCount>0){
                result[index++]=num;
                thrCount--;
            }
            if(index==k){
                break;
            }
                
        }
        return result;

    }
}