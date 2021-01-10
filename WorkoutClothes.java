class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        for (int i=0; i<reserve.length; i++) {
            for(int j=0; j<lost.length; j++) {
                if (lost[j] == reserve[i]) {
                    System.out.println("Worked: " + lost[j] + " " + reserve[i]);
                    lost[j] = -1;
                    reserve[i] = -10;
                    break;
                }       
            }
        }
        for (int i=0; i<reserve.length; i++) {
            for (int j=0; j<lost.length; j++) {
                if (lost[j] == (reserve[i]-1) || lost[j] == (reserve[i]+1)) {
                    lost[j] = -1;
                    break;
                }
            }
        }
        for (int i=0; i<lost.length; i++) {
            if (lost[i] != -1)
                answer++;
        }
        answer = n - answer; 
        return answer;
    }
}