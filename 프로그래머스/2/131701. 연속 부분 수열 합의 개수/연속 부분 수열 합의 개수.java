import java.util.*;
class Solution {
    public int solution(int[] elements) {
        int answer = 0,count=1;
        Set<Integer>s = new HashSet<>();
        while(count!=elements.length+1){
            for(int i=0; i<elements.length; i++){
                int sum = 0;
                int temp = i;
                for(int j=0; j< count; j++){
                    if(temp>=elements.length) 
                        temp = 0;
                    sum += elements[temp++];
                }
                if(!s.contains(sum)){
                    s.add(sum);
                    answer++;
                }
            }
            count++;
        }
        return answer;
    }
}