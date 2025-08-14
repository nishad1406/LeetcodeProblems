class Solution {
    public String largestGoodInteger(String num) {
        String maxTriplet = "";

        for (int i = 0; i + 2< num.length(); i++) {
            char first = num.charAt(i);
            if (first == num.charAt(i + 1) && first == num.charAt(i + 2)) {
                
                if (maxTriplet.isEmpty() || first > maxTriplet.charAt(0)) {
                    maxTriplet = "" + first + first + first;
                }
            }
        }
        return maxTriplet;
    }
}