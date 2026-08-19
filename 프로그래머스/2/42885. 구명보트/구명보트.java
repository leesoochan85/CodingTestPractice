import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        Deque <Integer> dq1 = new LinkedList<>();
        Deque <Integer> dq2 = new LinkedList<>();
        
        for(int i=0;i<people.length;i++){
            dq1.offer(people[i]);
        }
        int small = dq1.pollFirst();
        int big=0;
        while(dq1.size()!=0){
            big = dq1.pollLast();
            if(small+big<=limit){
                answer++;
                small=0;
                if(dq1.size()!=0)
                    small=dq1.pollFirst();
            }else{
                dq2.offer(big);
            }
        }
        if(small!=0) answer++;
        while(dq2.size()!=0){
            dq2.poll();
            answer++;
        }
        
        
        return answer;
    }
}