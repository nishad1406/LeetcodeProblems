class Solution {
    public int scoreOfString(String s) {
        int sum=0;
		for (int i=0;i<s.length()-1 ;i++ ) {
			int j=i+1;
			int add=s.charAt(i)-s.charAt(j);
			if (add<0) {
				add*=-1;
			}
			sum+=add;
		}
        return sum;
    }
}