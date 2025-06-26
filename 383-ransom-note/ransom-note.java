class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        int[] letters = new int[26];
        for(char ch: magazine.toCharArray()){
            letters[ch-'a']++;
        }

        for(char ch : ransomNote.toCharArray()){
            if(letters[ch-'a']==0){
                return false;
            } else{
                letters[ch-'a']--;
            }
        }
        return true;
    }
}