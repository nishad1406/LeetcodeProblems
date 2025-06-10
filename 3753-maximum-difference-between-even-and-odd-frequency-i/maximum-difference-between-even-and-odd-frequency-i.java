class Solution {
    public int maxDifference(String s) {
        int [] arr = new int[26];
        for(char ch: s.toCharArray()){
            arr[ch-'a']++;
        }
        int oddMax=0;
        int evenMin=s.length();

        for(int i: arr){
            if(i%2==1) {
                oddMax=Math.max(i, oddMax);
            } else {
                evenMin=Math.min(i==0?s.length():i, evenMin);
            }
        }
        return oddMax-evenMin;

    }
}