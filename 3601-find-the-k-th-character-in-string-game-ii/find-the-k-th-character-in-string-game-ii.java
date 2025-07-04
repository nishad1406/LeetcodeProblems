class Solution {
    public char kthCharacter(long k, int[] operations) {
        double total = 1;

        for (int i = 0; i < operations.length; i++){
            total *= 2;
        }
        double K = k;
        double windowSize = total;

        int adds = 0;

        for (int i = operations.length - 1; i > -1; i--){
            windowSize /= 2;
            if (K > windowSize){
                adds += operations[i];
                K = K - windowSize;
            }
        }

        return (char)('a' + (adds % 26));
    }
}