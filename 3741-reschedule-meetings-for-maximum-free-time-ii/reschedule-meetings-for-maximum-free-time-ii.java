class Solution {
    public int maxFreeTime(int eventTime, int[] startTime, int[] endTime) {

        int lastEnd=0;
        int n=startTime.length;
        int maxLeft=0;
        int result=0;

        int []gaps= new int[n+1];

        for(int i=0;i<n;i++){
            gaps[i]=startTime[i]-lastEnd;
            lastEnd=endTime[i];
        }
        gaps[n]=eventTime-lastEnd;

        int [] maxRight = new int[n+1];
        for(int i=n-1; i>=0; i--){
            maxRight[i]=Math.max(maxRight[i+1], gaps[i+1]);
        }

        for(int i=1;i<=n;i++){
            int duration = endTime[i-1] - startTime[i-1];

            if(maxLeft >=duration || maxRight[i] >= duration){
                result = Math.max(result, gaps[i-1] + duration + gaps[i]);
            }

            result = Math.max(result, gaps[i-1] + gaps[i]);
            maxLeft = Math.max(maxLeft, gaps[i-1]);
        }
        return result;
    }
}