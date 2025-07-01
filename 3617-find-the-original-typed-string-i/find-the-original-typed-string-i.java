class Solution {
    public int possibleStringCount(String word) {
        int count=1;

		for (int i=0;i<word.length() ; ) {
			int j=i+1;
			for (;j<word.length() ;j++ ) {
				if (word.charAt(i)==word.charAt(j)) {
					count++;
				} else{
					break;
				}
			}
			i=j;
		}
		return count;
    }
}