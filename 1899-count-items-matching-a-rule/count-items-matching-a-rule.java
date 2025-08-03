class Solution {
    public int countMatches(List<List<String>> items, String key, String value) {
        int column = 0, count = 0;

        if (key.equals("color")) {
            column = 1;
        } else if (key.equals("name")) {
            column = 2;
        }
        
        for (int row = 0; row < items.size(); row++) {
            if (items.get(row).get(column).equals(value)) {
                count++;
            }
        }
        return count;
    }
}