class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String []words = text.split(" ");
        int wordCount=0;
        for(int i=0;i<words.length;i++){
            int count=0;
            for(int j=0;j<brokenLetters.length();j++){
                for(int k=0;k <words[i].length();k++){
                    if(brokenLetters.charAt(j)==words[i].charAt(k)){
                        count++;
                        break;
                    }
                }
                if(count==1){
                    break;
                }
            }
            if(count==0)
                wordCount++;

        }
        return wordCount;
    }
}