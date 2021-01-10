import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int solution(int n) {        
        int answer = 0;
        int power = 0;
        
        // Find the biggest power of 3 smaller than n
        for (int i=0; i<n; i++) {
            if (Math.pow(3, i) > n) {
                power = i-1; 
                break;
            }
        }
        
        // Calculate each digit in base 3, and add the digit to ArrayList
        int n_subtracted = n;
        List<Integer> base_three = new ArrayList<>();
        for (int i=power; i>=0; i--) {
            int digit = 0;
            while ((n_subtracted-Math.pow(3, i)) >= 0) {
                n_subtracted -= Math.pow(3, i);
                digit += 1;
            }
            base_three.add(digit);
        }
        
        // Reverse the list
        Collections.reverse(base_three); 

        // Calculate the result in base 10
        for (int i=0; i<=power; i++) {
            answer += base_three.get(i) * Math.pow(3, power-i); 
        }
        return answer;
    }
}