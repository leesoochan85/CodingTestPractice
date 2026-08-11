class Solution {
    public int solution(int n) {
        int answer = 0, count=1;
        int temp=n;
        while(temp<=n){
            temp=0;
            int divideNum = n/count;
            for(int i=0;i<count;i++){
                temp+=divideNum;
                divideNum++;
            }
            for(int j=0; j<divideNum-count; j++){
                if(temp!=n && temp>n) temp-=count;
                else if(temp==n){
                    answer++;
                    break;
                }
            }count++;
        }
        return answer;
    }
}