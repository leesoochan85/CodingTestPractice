import java.util.*;
class Solution {
    public int solution(int[] sco, int K) {
        int answer = 0;
        PriorityQueue <Integer> pq = new PriorityQueue<>();
        for(int i:sco){
            pq.add(i);
        }
        while(pq.peek()<K && pq.size()>=2){
            int f = pq.poll();
            int s = pq.poll();
            
            int temp = f+s*2;
            pq.add(temp);
            answer+=1;
        }
        if(pq.size()<=1 && pq.peek()<K) return -1;
        return answer;
    }
}