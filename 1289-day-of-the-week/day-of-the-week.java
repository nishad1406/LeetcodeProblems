class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday","Friday","Saturday"};
        int months[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int totalDays = day;
        int normalYear=0,leapYear=0;
        for(int i=1;i < month; i++){
            totalDays+=months[i];
        }
        if(isLeapYear(year) && month>2){
            totalDays++;
        }
        year--;
        leapYear = (year/4) - (year/100) + (year/400);
        normalYear=year-leapYear;
        totalDays= totalDays + ((leapYear*366)%7) + ((normalYear *365)%7);
        return days[(totalDays)%7];

    }

    private static boolean isLeapYear(int year){
        return (year % 400==0) || ((year%100 !=0) && (year %4==0));
    }
}