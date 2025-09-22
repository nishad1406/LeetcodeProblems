class Solution {
    public int maxFrequencyElements(int[] nums) {
        
        int freq[]= new int[nums.length];
		int db=-1;
		for (int i=0;i<nums.length ;i++ ) {
			int count=1;
			for (int j=i+1;j<nums.length ;j++ ) {
				if (nums[i]==nums[j]) {
					count++;
					freq[j]=db;
				}
			}
			if (freq[i]!=db) {
				freq[i]=count;	
			}	
		}

        Arrays.sort(freq);
		// System.out.println(Arrays.toString(freq));
		int add=freq[freq.length-1];
		int temp=0;
		for (int i=freq.length-1;i>0 ;i-- ) {
			int j=i-1;
			if (freq[i]==freq[j]) {
				temp=freq[j];
				// System.out.println(i);
				add+=temp;
			}else{
				break;
			}
		}
        return add;
    }
}