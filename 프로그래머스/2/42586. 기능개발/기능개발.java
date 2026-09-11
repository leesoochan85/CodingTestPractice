import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer>answer= new ArrayList<>();
        int count =0,check=0,temp=0;
        Queue <Integer> q = new LinkedList<>();
        for(int i=0;i<progresses.length;i++){
            q.offer(progresses[i]);
        }
        
        while(q.size()!=0){
            for(int i=count;i<progresses.length;i++){
                progresses[i]+=speeds[i];
            }
            temp=0;
            if(progresses[count]>=100){
                while(count<progresses.length && progresses[count]>=100) {
                    count++;
                    temp++;
                }
                answer.add(temp);
            }
            for(int k=0;k<temp;k++){
                q.poll();
            }
        }
        int []answer1=new int[answer.size()];
        for(int i=0;i<answer.size();i++){
            answer1[i]=answer.get(i);
        }
        
        return answer1;
    }
}