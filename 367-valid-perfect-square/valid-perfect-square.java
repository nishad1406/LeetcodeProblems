class Solution {
    public boolean isPerfectSquare(int num) {
        if(num < 2) return true;
        int low = 2, high = num / 2;
        while(low <= high) {
            int mid = (high + low) / 2;
            long squar = (long) mid * mid;
            if(squar == num) return true;
            else if(num > squar) low = mid + 1;
            else high = mid - 1;
        }
        return false;
    }
}