class Solution {
    public int maxFreqSum(String s) {
        int arr[] = new int[26];
        int maxconsont = 0;
        int maxvowel = 0;

        for(int i=0;i<s.length();i++){
            int num = s.charAt(i)-'a';
            arr[num]+=1;
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                if(arr[num]>maxvowel)
                maxvowel=arr[num];
                }else{
                    if(arr[num]>maxconsont)
                maxconsont=arr[num];
            }
        }
        return maxconsont+maxvowel;

    }
}