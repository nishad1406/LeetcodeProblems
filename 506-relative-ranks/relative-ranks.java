import java.util.*;

class Solution {
    public String[] findRelativeRanks(int[] score) {
        int[] sorted = score.clone();
        Arrays.sort(sorted);

        // Reverse
        for (int i = 0; i < sorted.length / 2; i++) {
            int temp = sorted[i];
            sorted[i] = sorted[sorted.length - 1 - i];
            sorted[sorted.length - 1 - i] = temp;
        }

        Map<Integer, Integer> scoreToRank = new HashMap<>();
        for (int i = 0; i < sorted.length; i++) {
            scoreToRank.put(sorted[i], i + 1);
        }

        String[] ranks = new String[score.length];
        for (int i = 0; i < score.length; i++) {
            int rank = scoreToRank.get(score[i]);
            if (rank == 1) ranks[i] = "Gold Medal";
            else if (rank == 2) ranks[i] = "Silver Medal";
            else if (rank == 3) ranks[i] = "Bronze Medal";
            else ranks[i] = String.valueOf(rank);
        }

        return ranks;
    }
}
