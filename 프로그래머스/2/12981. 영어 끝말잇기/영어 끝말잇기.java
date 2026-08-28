import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        char before, after;
        Set<String>s=new HashSet<>();
        s.add(words[0]);
        for(int i=1; i<words.length;i++){
            before = words[i-1].charAt(words[i-1].length()-1);
            after = words[i].charAt(0);
            if(before==after){
                if(!s.contains(words[i])) {
                    s.add(words[i]);
                }
                else{
                    answer[0]=i%n+1;
                    answer[1]=i/n+1;
                    break;
                }
            }
            else{
                answer[0]=i%n+1;
                answer[1]=i/n+1;
                break;
            }
        }
        
        return answer;
    }
}