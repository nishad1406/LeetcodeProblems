class Solution {
    private String convert(int num){
        if(num == 1)
            return "1";
        StringBuilder sb = new StringBuilder("");
        while (num != 0){
            int r = num % 2;
            num /= 2;
            if(r == 1)
                sb.append("1");
            else
                sb.append("0");
        }
        return sb.reverse().toString();
    }
    public String convertDateToBinary(String date) {
        String year = convert(Integer.parseInt(date.substring(0, 4)));
        String month = convert(Integer.parseInt(date.substring(5, 7)));
        String day = convert(Integer.parseInt(date.substring(8, 10)));
        return year + "-" + month + "-" + day;
    }
}