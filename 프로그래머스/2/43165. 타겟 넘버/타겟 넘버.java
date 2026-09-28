class Solution {
    int answer=0;
    public int solution(int[] numbers, int target) {
        dfs(numbers, target, 0, 0);
        return answer;
        
    }
    
    public void dfs(int [] numbers, int target, int idx, int temp){
        if(idx==numbers.length) {
            if(target == temp) answer++;
        }
        if(idx < numbers.length){
            dfs(numbers, target, idx+1,temp+numbers[idx]);
            dfs(numbers, target, idx+1,temp-numbers[idx]);
        }
        
    }
}