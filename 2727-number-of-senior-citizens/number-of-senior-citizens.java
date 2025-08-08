class Solution {
    public int countSeniors(String[] details) {
        int count=0;
        
        for(int i=0; i<details.length;i++){
            String s = details[i];
            String twoDigits = s.substring(11, 13);
            int result = Integer.parseInt(twoDigits);
            if(result>60){
                count++;
            }
        }
        return count;
    }
}