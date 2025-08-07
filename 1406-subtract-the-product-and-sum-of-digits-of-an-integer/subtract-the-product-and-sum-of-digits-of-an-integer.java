class Solution {
    public int subtractProductAndSum(int n) {
        int prod=1;
        int add=0;
        for(int i=n;i!=0;i/=10){
            int val=i%10;
            prod*=val;
            add+=val;
        }

        return prod-add;
    }
}