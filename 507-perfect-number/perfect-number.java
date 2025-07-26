class Solution {
    public boolean checkPerfectNumber(int num) {
        int dup=num;
		int sum=0;

		for (int i=1;i<=num/2 ;i++ ){
			if (num%i==0) {
				sum+=i;
			}
		}

		return sum==num;
    }
}