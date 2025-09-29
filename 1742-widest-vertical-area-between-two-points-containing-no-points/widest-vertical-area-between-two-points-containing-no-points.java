class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int n = points.length;
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = points[i][0];
        }
        Arrays.sort(arr);

        int ans = 0;
        for(int i=1; i<n; i++){
            if (arr[i] - arr[i-1] == 1){
                ans = ans == 0 ? 1 : ans;
            }
            else if (arr[i] - arr[i-1] > 1){
                ans = Math.max(ans, arr[i] - arr[i-1]);
            }
        }
        return ans;
    }
}