class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int count=0;
        int []rank = new int[friends.length];
        for(int i=0;i<order.length;i++){
            for(int j:friends){
                if(j==order[i]){
                    rank[count++]=j;
                    break;
                }
            }
        }
        return rank;
    }
}