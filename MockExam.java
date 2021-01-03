class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {}; 
        int student1_score = student1(answers);
        int student2_score = student2(answers);
        int student3_score = student3(answers);
        if (student1_score > student2_score) {
            if (student1_score > student3_score) {
                answer = new int[1];
                answer[0] = 1;
            }
            else {
                if (student1_score == student3_score) {
                    answer = new int[2]; 
                    answer[0] = 1;
                    answer[1] = 3; 
                }
                else {
                    answer = new int[1];
                    answer[0] = 3;  
                }
            }
        } 
        else {
            if (student1_score == student2_score) {
                if (student1_score > student3_score) {
                    answer = new int[2];
                    answer[0] = 1;
                    answer[1] = 2;          
                }
                else {
                    if (student1_score == student3_score) {
                        answer = new int[3];
                        answer[0] = 1;
                        answer[1] = 2;
                        answer[2] = 3; 
                    }
                    else {
                        answer = new int[1];
                        answer[0] = 3;
                    }
                }
            }
            else {
                if (student2_score > student3_score) {
                    answer = new int[1];
                    answer[0] = 2; 
                }
                else {
                    if (student2_score == student3_score) {
                        answer = new int[2];
                        answer[0] = 2;
                        answer[1] = 3; 
                    }
                    else {
                        answer = new int[1];
                        answer[0] = 3; 
                    }
                }
            }
        }
        for (int i=0; i<answer.length; i++)
            System.out.println(answer[i]);
        return answer;
    }
    
    int student1(int[] answers) {
        int score = 0;
        int n;
        for (int i=0; i<answers.length; i++) {
            n = i%5;
            switch(n) {
            case 0:
                if (answers[i] == 1) {
                    score++;
                }        
                break;
            case 1:
                if (answers[i] == 2) {
                    score++;
                }
                break;
            case 2:
                if (answers[i] == 3) {
                    score++;
                }
                break;
            case 3:
                if (answers[i] == 4) {
                    score++; 
                }    
                break;
            case 4:
                if (answers[i] == 5) {
                    score++; 
                }
                break;
            }
        }
        return score;
    }
    
    int student2(int[] answers) {
        int score = 0;
        int n;
        for (int i=0; i<answers.length; i++) {
            n = i%8;
            switch(n) {
            case 0:
                if (answers[i] == 2) {
                    score++;
                }     
                break;
            case 1:
                if (answers[i] == 1) {
                    score++;
                }
                break;
            case 2:
                if (answers[i] == 2) {
                    score++;
                }
                break;
            case 3:
                if (answers[i] == 3) {
                    score++; 
                }    
                break;
            case 4:
                if (answers[i] == 2) {
                    score++; 
                }
                break;
            case 5:
                if (answers[i] == 4) {
                    score++;
                }    
                break;
            case 6:
                if (answers[i] == 2) {
                    score++;
                }
                break;
            case 7:
                if (answers[i] == 5) {
                    score++;
                }    
                break;
            }
        }
        return score;
    }
    
    int student3(int[] answers) {
        int score = 0;
        int n;
        for (int i=0; i<answers.length; i++) {
            n = i%10;
            switch(n) {
            case 0:
                if (answers[i] == 3) {
                    score++;
                }     
                break;
            case 1:
                if (answers[i] == 3) {
                    score++;
                }
                break;
            case 2:
                if (answers[i] == 1) {
                    score++;
                }
                break;
            case 3:
                if (answers[i] == 1) {
                    score++; 
                }    
                break;
            case 4:
                if (answers[i] == 2) {
                    score++; 
                }
                break;
            case 5:
                if (answers[i] == 2) {
                    score++;
                }    
                break;
            case 6:
                if (answers[i] == 4) {
                    score++;
                }
                break;
            case 7:
                if (answers[i] == 4) {
                    score++;
                }    
                break;
            case 8:
                if (answers[i] == 5) {
                    score++;
                }
                break;
            case 9:
                if (answers[i] == 5) {
                    score++;
                }
                break;
            }
        }
        return score;
    }
}