class Solution {
    public int[] getNoZeroIntegers(int n) {
        int[] arr= new int[2];
        for(int i=1;i<n;i++){
            arr[0]=i;
            arr[1]=n-i;
            if(String.valueOf(arr[0]).contains("0")||String.valueOf(arr[1]).contains("0"))   {
                continue;
            }else{
                break;
            }
        }
        return arr;
    }
}