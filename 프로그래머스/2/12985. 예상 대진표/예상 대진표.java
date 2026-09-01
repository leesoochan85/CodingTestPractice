class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 1, big=0, small=0;
        int bigDivide=0, smallDivide=0, remain=0;
        if(a>b){
            big =a;
            small =b;
        }else{
            big=b;
            small=a;
        }
        
        
        
        while(big!=small){
            bigDivide = big/2;
            remain = big%2;
            big = bigDivide + remain;
            
            smallDivide = small/2;
            remain = small%2;
            small= smallDivide+remain;
            
            if(big!=small)answer++;
        }
        
        
        return answer;
    }
}