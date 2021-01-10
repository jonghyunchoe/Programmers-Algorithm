class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String[] day_of_week = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int[] months = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int days_past = b;
        for (int i=0; i<a-1; i++) 
            days_past += months[i];
        answer = day_of_week[(days_past+4)%7];
        return answer;
    }
}