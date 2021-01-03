import java.util.HashSet;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        // Create a set to not include overlapping results
        HashSet<Integer> number_results = new HashSet<>();
        for (int i=0; i<numbers.length; i++) {
            for (int j=i+1; j<numbers.length; j++) {
                number_results.add(numbers[i] + numbers[j]);
            }
        }
        
        // Move the elements from the HashSet to Array
        answer = new int[number_results.size()];
        int index = 0;
        for (int e: number_results) {
            answer[index] = e;
            index++;
        }
        
        // Sort the array in an ascending order
        Arrays.sort(answer);
        return answer;
    }
}