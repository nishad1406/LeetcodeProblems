class Solution {
    public String largestGoodInteger(String num) {
        String maxNum = "";
        int k = 3; 

        for (int i = 0; i <= num.length() - k; i++) {
            char first = num.charAt(i);
            if (first == num.charAt(i + 1) && first == num.charAt(i + 2)) {
                
                if (maxNum.isEmpty() || first > maxNum.charAt(0)) {
                    maxNum = "" + first + first + first;
                }
            }
        }
        return maxNum;
    }
}