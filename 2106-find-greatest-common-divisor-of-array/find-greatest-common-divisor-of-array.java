class Solution {
    public int findGCD(int[] nums) {
        int min=nums[0];
        int max=0;
        for(int i=0;i< nums.length;i++){
            int num=nums[i];
            if(num<min){
                min=num;
            }
            if(num>max){
                max=num;
            }
        }
        int divisor=1;
        for(int i=min;i>0;i--){
            if((min%i==0) && (max%i==0)){
                divisor=i;
                break;
            }
        }
        return divisor;
    }
}