// class Solution {
//     int answer=0;
//     public int solution(int[] numbers, int target) {
//         dfs(numbers, target, 0, 0);
//         return answer;
        
//     }
    
//     public void dfs(int [] numbers, int target, int idx, int temp){
//         if(idx==numbers.length) {
//             if(target == temp) answer++;
//         }
//         if(idx < numbers.length){
//             dfs(numbers, target, idx+1,temp+numbers[idx]);
//             dfs(numbers, target, idx+1,temp-numbers[idx]);
//         }
        
//     }
// }

class Solution {
    public int solution(int[] numbers, int target) {
        return dfs(numbers, target, 0, 0);
    }
    
    public int dfs(int [] numbers, int target, int idx, int temp){
        if(idx==numbers.length) {
            if(target == temp) return 1;
            else return 0;
        }
        
        return dfs(numbers, target, idx+1,temp+numbers[idx]) 
            + dfs(numbers, target, idx+1,temp-numbers[idx]);
        
        
    }
}