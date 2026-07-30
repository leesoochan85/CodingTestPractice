class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0, highLimit;
        
        for(int j=0;j<schedules.length;j++){
            int temp=0;
            int clock = schedules[j]/100;
            int remain = schedules[j]%100;
            int reremain = remain%10;
            
            if(remain>49 && remain<60) 
                highLimit = (clock+1)*100+reremain;
            else 
                highLimit = clock*100+remain+10;
            
            for(int i=0;i<7;i++){
                if(startday>=1 && startday<=5){
                    if(timelogs[j][i]<=highLimit)
                        temp++;                    
                }
                startday++;
                if(startday>7) startday=1;
            }
            if(temp>=5) {
                answer++;
            }
        }        
        
        return answer;
    }
}