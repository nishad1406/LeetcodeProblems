class Solution {
    public int countDigits(int num) {
        int count=0;
        for(int i=num;i!=0;i/=10){
            int div=i%10;
            if(div!=0 && num%div==0)
                count++;
        }
        return count;
    }
}