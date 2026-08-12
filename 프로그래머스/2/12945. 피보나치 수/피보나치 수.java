class Solution {
    public long solution(int n) {
        long answer = 1, twoAgo = 0, ago = 1, current=2, temp=0;
        while(current-1 != n){
            temp = (twoAgo+ago)%1234567;
            twoAgo=ago;
            ago=temp;
            current++;
        }
        answer = temp;
        return answer;
    }
}