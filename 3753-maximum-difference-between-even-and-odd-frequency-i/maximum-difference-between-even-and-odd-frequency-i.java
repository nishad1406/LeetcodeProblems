class Solution {
    public int maxDifference(String s) {
        Map<Character, Integer> frequency = new HashMap<>();

        for(char ch: s.toCharArray()){
            frequency.put(ch, frequency.getOrDefault(ch,0)+1);
        }

        int maxOdd=0;
        int minEven=Integer.MAX_VALUE;

        for(Map.Entry<Character, Integer> entry : frequency.entrySet()){
            if(entry.getValue() > maxOdd && entry.getValue()%2!=0){
                maxOdd=entry.getValue();
            } else if(entry.getValue() < minEven && entry.getValue()%2==0){
                minEven = entry.getValue();
               
            }
        }
        return maxOdd -minEven;

    }
}