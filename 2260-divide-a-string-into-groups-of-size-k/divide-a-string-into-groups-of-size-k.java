class Solution {
    public String[] divideString(String s, int k, char fill) {
        int add= k- s.length()%k;
		int len= s.length()%k==0?s.length()/k:(add+s.length())/k;
		StringBuilder sb = new StringBuilder(s);
		if (s.length()%k!=0) {
			for (int i=s.length();i<len*k ;i++ ) {
				sb.append(fill);
			}
		}

		String [] divide = new String[len];
		for (int i=0,j=0;i<sb.length() ;i+=k,j++ ) {
			int end = Math.min(i + k, sb.length());
			divide[j]=sb.toString().substring(i, end);
		}
		
		return divide;
    }
}