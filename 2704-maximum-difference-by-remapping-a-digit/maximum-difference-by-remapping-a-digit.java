class Solution {
    public int minMaxDifference(int num) {
        String str = Integer.toString(num);
        char []maxVal = str.toCharArray();
		char []minVal = str.toCharArray();
		char change = ' ';
		int count=0;
		for (int i=0;i<maxVal.length ;i++ ) {
				if (maxVal[i]!='9' && count==0 ) {
					change=maxVal[i];
					maxVal[i]='9';
					count++;
				}
				if (maxVal[i]==change ) {
					maxVal[i]='9';
				}
		}
		char min = minVal[0];
		for (int i=0;i<minVal.length ;i++ ) {
			if (min==minVal[i]) {
				minVal[i]='0';
			}
		}
		int maxNum = Integer.parseInt(new String(maxVal));
        int minNum = Integer.parseInt(new String(minVal));

        return maxNum - minNum;
    }
}